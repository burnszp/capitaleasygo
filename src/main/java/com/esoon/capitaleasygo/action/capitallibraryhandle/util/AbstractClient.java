/*
 * Copyright 2007 Mentor Graphics Corporation. All Rights Reserved.
 * <p>
 * Recipients who obtain this code directly from Mentor Graphics use it solely
 * for internal purposes to serve as example Java web services.
 * This code may not be used in a commercial distribution. Recipients may
 * duplicate the code provided that all notices are fully reproduced with
 * and remain in the code. No part of this code may be modified, reproduced,
 * translated, used, distributed, disclosed or provided to third parties
 * without the prior written consent of Mentor Graphics, except as expressly
 * authorized above.
 * <p>
 * THE CODE IS MADE AVAILABLE "AS IS" WITHOUT WARRANTY OR SUPPORT OF ANY KIND.
 * MENTOR GRAPHICS OFFERS NO EXPRESS OR IMPLIED WARRANTIES AND SPECIFICALLY
 * DISCLAIMS ANY WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE,
 * OR WARRANTY OF NON-INFRINGEMENT. IN NO EVENT SHALL MENTOR GRAPHICS OR ITS
 * LICENSORS BE LIABLE FOR DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING LOST PROFITS OR SAVINGS) WHETHER BASED ON CONTRACT, TORT
 * OR ANY OTHER LEGAL THEORY, EVEN IF MENTOR GRAPHICS OR ITS LICENSORS HAVE BEEN
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 * <p>
 */
package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.soap.Name;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.w3c.dom.Document;


/**
 * A simple base class for CIS web services client.
 * It can be easily used by extending and overriding the abstract methods.
 * Concrete implementations are also provided as examples.
 *
 * This class provides all methods to invoke any CIS web service.
 * Basic SOAP utilities provided are based on the SAAJ API and its AXIS implementation.
 */
public abstract class AbstractClient
{
	//
	//-----------------------------------------------------------------
	//  CIS connection parameters
	//  Please change the values below where appropriate.
	//-----------------------------------------------------------------
	//
	/**
	 * The host address of the machine where CIS is running.
	 * This can be an IP address (e.g. "196.222.111.23") or the "localhost" string if
	 * CIS is running on the same machine as this client application.
	 *
	 * Please change the value below if CIS is running on a different machine.
	 */
	private static String IMPORT_LIBRARYPARTS_CLIENT  = "ImportLibraryPartsClient" ;
	
	protected   String cisHost = "localhost";

	/**
	 * The port number on which CIS is listening on the host machine.
	 * This port number is declared in the chsprops.xml file of the CHS installation
	 * of CIS on the host machine:
	 * <webserver host="cis" port="49901" cisjettyroot="../adaptors/webapps" embedded="false"/>
	 * where 49901 is the default value supplied at installation.
	 *
	 * Please change the value below to match the value declared in chsprops.xml on the CIS host
	 * machine if it has been changed after installation.
	 */
	protected   int port = 49901;

	/**
	 * The CHS user name used to authenticate requests to CIS.
	 * This must be a valid user login name created in Capital User.
	 *
	 * Please change the value below to match the login name
	 * of a valid user declared in Capital User.
	 */
	private   String userName = "system";

	/**
	 * The CHS user password used to authenticate requests to CIS.
	 * This must be a valid user password created in Capital User.
	 *
	 * Please change the value below to match the password
	 * of a valid user declared in Capital User.
	 */
	private   String password = "manager";

	/**
	 * The directory used by this client application to store data
	 * retrieved from CIS (e.g. SVG diagrams)
	 *
	 * Please change the value below to an existing directory.
	 */
	protected static  String OUTPUT_DIRECTORY = "C:/temp/CIS";

	//
	//-----------------------------------------------------------------
	//  Constants
	//  Please do not change any of the values below as they
	//  match values hard-coded in CIS
	//-----------------------------------------------------------------
	//
	/**
	 * The context associated to the CIS servlet.
	 * This string is to be included in the URL used to send requests
	 * to CIS (for CHS web services)
	 */
	private static  String CIS_CONTEXT = "/chs/cis/";

	/**
	 * The names of the authentication parameters used in the header of each SOAP
	 * request message sent to CIS.
	 */
	private static final String[] CIS_AUTHENTICATION_PARAMS = {"chsusername", "chspassword"};

	/**
	 * The SOAP fault resulting from the request to a CIS asynchronous web service.
	 * This response is valid and to be expected.
	 */
	private static final String CIS_NULL_RESPONSE_FAULT =
			"chs.bridges.webservices.exceptions.WebServiceNullResponseException";

	/**
	 * The SOAP fault resulting from the request to an external asynchronous web service.
	 * This response is valid and to be expected.
	 */
	private static final String EXTERNAL_NULL_RESPONSE_FAULT =
			"org.xml.sax.SAXParseException: The root element is required in a well-formed document.";

	//
	//-----------------------------------------------------------------
	// Local parameters
	//-----------------------------------------------------------------
	//
	private boolean loggingMode = true;
	
	protected String symboLibName;
	protected String symboName;
	//
	//-----------------------------------------------------------------
	// Methods
	//-----------------------------------------------------------------
	//

	/**
	 * To be overriden to provide the name of the web service to be invoked
	 * @return The web service name
	 */
	protected abstract String getWebServiceName();

	/**
	 * To be overriden to provide the request payload XML document
	 * @return The request payload as an XML string
	 */
	protected abstract String getRequestPayload();

	/**
	 * To be overriden to specify if a response is expected from the web service
	 * @return true if a response is expected
	 */
	protected abstract boolean isResponseExcepted();

	/**
	 * Can be overriden to specify the URL of the web service to be invoked.
	 * By default, this will return: http://localhost:49901/chs/cis/<service name>
	 * @return The URL of the web service to be invoked
	 * @throws MalformedURLException Software error
	 */
	protected URL getServiceURL() throws MalformedURLException
	{
		
		return new URL("http", cisHost, port, CIS_CONTEXT + getWebServiceName());
	}

	/**
	 * Invokes the web service
	 * @param loggingMode If true, request and response SOAP messages will be output
	 * @param param An additional parameter passed through the command line that can be used by any specific implementation
	 * @throws Exception Software configuration or server problem
	 */
	public void invoke() throws Exception
	{
		PropertieUtil propUtil = PropertieUtil.getPropertieUtil();
		cisHost = propUtil.getValue(ConstantsUtil.CIS_IP).trim();
		port = Integer.parseInt(propUtil.getValue(ConstantsUtil.CIS_PORT).trim());
		userName = propUtil.getValue(ConstantsUtil.CIS_USERNAME).trim();
		password = propUtil.getValue(ConstantsUtil.CIS_PASSWORD).trim();
		System.out.println(cisHost+"-"+port+"-"+password+"-"+userName);
		Document responsePayload = getCISResponse();
		if (responsePayload != null) {
			processResponse(responsePayload);
		}
	}
	/**
	 * Called by invoke() and may be overriden to provide adequate processing of the response.
	 * By default, it simply outputs the payload as XML.
	 * @param responsePayload The response payload as a DOM document
	 * @throws Exception Software configuration problem or invalid document
	 */
	protected void processResponse(Document responsePayload) throws Exception
	{
		WebServiceUtils.writeDOMDocumentToStream(responsePayload, System.out);
	}

	/**
	 * Called by invoke() to retrieve the response from the CIS web service
	 * @return The response as a DOM document
	 * @throws Exception Software configuration problem
	 */
	protected Document getCISResponse() throws Exception
	{
		if (loggingMode) {
			System.out.println(">>>>>> Web service invokation: " + getServiceURL());
		}

		// Format the SOAP request message
		SOAPMessage requestMsg = WebServiceUtils.newBlankSOAPMessage();
		Document requestPayload = WebServiceUtils.parseToDOM(new ByteArrayInputStream(getRequestPayload().getBytes("UTF8")));
		WebServiceUtils.insertXMLPayloadInSOAPMessage(requestPayload, requestMsg);
		insertCISSOAPAuthentication(requestMsg);
		addRequestSOAPAttachments(requestMsg);

		// Send the request message to CIS and obtain the reponse:
		// if the service is synchronous, this will block until the
		// server has finished processing
		SOAPMessage responseMsg = sendSOAPRequest(requestMsg, getServiceURL(), isResponseExcepted());

		if (loggingMode) {
			System.out.println();
			System.out.println(">>>>>> Request SOAP message:");
			requestMsg.writeTo(System.out);
			System.out.println();
			System.out.flush();

			System.out.println();
			System.out.println(">>>>>> Response SOAP message:");
			if (responseMsg == null) {
				System.out.println("null");
			}
			else if (!hasResponseAttachments()) {
				responseMsg.writeTo(System.out);
				System.out.println();
				System.out.flush();
			}
		}

		Document responsePayload = null;
		if (responseMsg != null) {
			if (WebServiceUtils.isSOAPFault(responseMsg)) {
				String fault = WebServiceUtils.getSOAPFaultString(responseMsg);
				if (isResponseExcepted() || !(CIS_NULL_RESPONSE_FAULT.equals(fault) ||
						EXTERNAL_NULL_RESPONSE_FAULT.equals(fault)) ||fault.contains("fail") ) {
					throw new Exception("SOAP Fault = " + fault);
				}
			}
			else if (!isResponseExcepted()) {
				throw new Exception("Unexpected unfaulty response received");
			}
			else {
				if (hasResponseAttachments()) {
					processResponseAttachments(responseMsg);
				}
				responsePayload = WebServiceUtils.extractXMLPayloadFromSOAPMessage(responseMsg);
			}
		}

		return responsePayload;
	}

	/**
	 * Inserts CIS authentication parameters in the SOAP message header
	 * @param messageSOAP The SOAP message
	 * @throws SOAPException SOAP API problem
	 */
	private void insertCISSOAPAuthentication(SOAPMessage messageSOAP) throws SOAPException
	{
		SOAPPart part = messageSOAP.getSOAPPart();
		SOAPEnvelope envelope = part.getEnvelope();
		SOAPHeader header = envelope.getHeader();
		if (header == null) {
			header = envelope.addHeader();
		}

		for (int i = 0; i < CIS_AUTHENTICATION_PARAMS.length; i++) {
			Name elemName = envelope.createName(CIS_AUTHENTICATION_PARAMS[i], "chs", "chs");
			SOAPHeaderElement elem = header.addHeaderElement(elemName);
			String value = i == 0 ? userName : password;
			elem.addTextNode(value);
		}
	}

	/**
	 * Creates a connection to the web service and invokes it.
	 * @param messageSOAP The SOAP request message
	 * @param url The CIS web server URL
	 * @param isResponseExpected Specifies if a response is expected (synchronous) or not (asynchronous)
	 * @return The response SOAP message
	 * @throws SOAPException SOAP API problem
	 */
	private SOAPMessage sendSOAPRequest(SOAPMessage messageSOAP, URL url, boolean isResponseExpected)
			throws SOAPException
	{
		SOAPMessage response = null;

		try {
			response = WebServiceUtils.sendSOAPRequest(messageSOAP, url);
		}
		catch (SOAPException exc) {
			// If the service returns no response, the the client will throw the following SOAP exception
			// which should be ignored if a response is actually not expected
			boolean ignoreSOAPFault = false;
			if ("org.xml.sax.SAXParseException: The root element is required in a well-formed document."
					.equals(exc.getMessage())) {
				ignoreSOAPFault = !isResponseExpected;
			}
			if (!ignoreSOAPFault) {
				throw exc;
			}
			response = null;
		}

		return response;
	}

	/**
	 * Called by getCISResponse() for the client to declare if it expects
	 * the response payload to be included in SOAP attachments
	 * @return true if the response payload is to be included in attachments
	 */
	protected boolean hasResponseAttachments()
	{
		return false;
	}

	/**
	 * Called by getCISResponse() for the client to add SOAP attachments to the request
	 * @param messageSOAP The SOAP request message to add attachments to
	 * @exception Exception Attachment cannot be performed (for instance, file not found)
	 */
	protected void addRequestSOAPAttachments(SOAPMessage messageSOAP) throws Exception
	{
		// No attachment by default
	}

	/**
	 * Called by getCISResponse() for the client to process an SOAP attachments included with the response
	 * @param messageSOAP The SOAP response message
	 * @throws Exception Attachment processing failed
	 */
	protected void processResponseAttachments(SOAPMessage messageSOAP) throws Exception
	{
		// No attachment processing by default
	}
}
