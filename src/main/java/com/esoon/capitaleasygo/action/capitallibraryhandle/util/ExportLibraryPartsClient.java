/*
 * Copyright 2008 Mentor Graphics Corporation. All Rights Reserved.
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

import org.w3c.dom.Document;

/**
 * A concrete implementation for the CIS "ExportProjectTemplate" web service client.
 */
public class ExportLibraryPartsClient  extends AbstractClient
{
	protected String outFile;
	protected String parts ; 
	protected boolean includescoping = true;
	protected boolean exportrevisions = true;
	public ExportLibraryPartsClient (String outFile,String parts ) throws Exception
	{
		this.outFile = outFile ; 
		this.parts = parts;
	}

	protected String getWebServiceName()
	{
		return "ExportLibraryParts";
	}

	protected String getRequestPayload()
	{
		return parts ;//" <Parts includescoping='"+includescoping+"' exportrevisions='"+exportrevisions+"'><Part partnumber=\""+libPartNumber+"'/></Parts>";
	}

	protected boolean isResponseExcepted()
	{
		return true;
	}

	protected void processResponse(Document responsePayload) throws Exception
	{
		// Save as XML file in output directory
		String filePath = outFile;
		WebServiceUtils.writeDOMDocumentToFile(responsePayload, filePath);
//		System.out.println(responsePayload);
		
		System.out.println("Exported library parts successfully written to: " + filePath);
	}
	public static void main(String[] args) {
		try {
			String parts = " <Parts includescoping='true' exportrevisions='true'><Part partnumber='16#'/></Parts>";
			ExportLibraryPartsClient client = new ExportLibraryPartsClient("D:/li.xml", parts);
			client.invoke();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
