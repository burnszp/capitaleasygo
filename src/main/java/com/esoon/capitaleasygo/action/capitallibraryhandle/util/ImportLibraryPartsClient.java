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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


/**
 * A concrete implementation for the CIS "ImportLibraryParts" web service client.
 */
public class ImportLibraryPartsClient extends AbstractClient
{
	protected String inFile;
	public ImportLibraryPartsClient(String inFile) throws Exception
	{
		this.inFile = inFile ;
	}

	protected String getWebServiceName()
	{
		return "ImportLibraryParts";
	}

	protected String getRequestPayload()
	{
		// Retrieve the library data file (previously exported from Capital Library)
		// We assume the program is started from the sample directory $CHS_HOME/WebServiceExamples
		String filePath = inFile;
		StringBuffer xmlString = new StringBuffer();
		BufferedReader in = null;
		try {
			File inputfile = new File(filePath);
			if(!inputfile.exists()){
				inputfile.createNewFile();
			}
			in = new BufferedReader(
					new InputStreamReader(new FileInputStream((inputfile)), "UTF8"));
			StringBuffer sb = new StringBuffer();
			String str;
			boolean firstLine = true;
			while ((str = in.readLine()) != null) {
				if (firstLine) {
					str = str.substring(str.indexOf("?>") + 1);
					firstLine = false;
				}
				str = str.replaceAll(" & ", "&amp;");
				sb.append(str);
			}
			xmlString.append("<importservice>");
			xmlString.append("<import content='xml' overwritecodedesc='true' overwritepart='true' scopeimport='true' overwritemode='truncate' >");

			xmlString.append(sb.toString());

			xmlString.append("</import>");
			xmlString.append("</importservice>");
		}
		catch(FileNotFoundException e) {
			throw new IllegalArgumentException("Please provide a valid file path", e);
		}
		catch(IOException e) {
			throw new RuntimeException("Error while reading file", e);
		}
		finally {
			if (in != null) {
				try {
					in.close();
				}
				catch (IOException ignore) {
				}
			}
		}

		return xmlString.toString();
	}

	protected boolean isResponseExcepted()
	{
		return true;
	}

	protected void processResponse(Document responsePayload) throws Exception
	{
		NodeList nodes = responsePayload.getElementsByTagName("importfeedback");
		String status = ((Element) nodes.item(0)).getAttribute("status");
		
		System.out.println("Import status---: " + status);
		if("fail".equals(status)){
			throw new Exception("fail");
		}
	}
	
	public static void main(String[] args) {
		ImportLibraryPartsClient client;
		try {
			client = new ImportLibraryPartsClient("D:/li.xml");
			client.invoke();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
