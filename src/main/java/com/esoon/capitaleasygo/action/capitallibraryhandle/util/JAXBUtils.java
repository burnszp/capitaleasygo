package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.acconsys.capital.lib.entity.DocumentBase;
import com.acconsys.capital.lib.entity.ObjectFactory;

public class JAXBUtils {

	private static String entityPackage = "com.acconsys.capital.lib.entity";

	public static JAXBElement xml2Object(String xmlPath) {
		JAXBElement je = null;
		File xmlFile = new File(xmlPath);

		try {
			if (!xmlFile.exists()) {
				xmlFile.createNewFile();
			}
			JAXBContext context = JAXBContext.newInstance(entityPackage,
					ObjectFactory.class.getClassLoader());

			je = (JAXBElement) context.createUnmarshaller().unmarshal(xmlFile);

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return je;
	}

	public static void main(String[] args) {
		DocumentBase base = (DocumentBase) (JAXBUtils
				.xml2Object("D:/temp/W23-0_1.xml").getValue());
	}

	public static void object2Xml(JAXBElement je, String outXmlPath) {
		try {
			File xmlFile = new File(outXmlPath);
			JAXBContext context = JAXBContext.newInstance(entityPackage);
			if (!xmlFile.exists()) {
				xmlFile.createNewFile();
			}
			Marshaller m = context.createMarshaller();
//			m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");// //编码格式
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);// 是否格式化生成的xml串
//			m.setProperty(Marshaller.JAXB_FRAGMENT, false);// 是否省略xm头声明信息
			m.marshal(je, new FileOutputStream(xmlFile));

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void contentReplace(String sourceFilePath, String distFilePath) {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			File sourceFile = new File(sourceFilePath);
			FileInputStream in = new FileInputStream(sourceFile);
			reader = new BufferedReader(new InputStreamReader(in, "utf-8"));// new
																			// FileReader(sourceFile));
			// writer = new BufferedWriter(new FileWriter(new
			// File(distFilePath)));
			FileOutputStream writerStream = new FileOutputStream(new File(
					distFilePath));
			writer = new BufferedWriter(new OutputStreamWriter(writerStream,
					"UTF-8"));

			String line;
			while ((line = reader.readLine()) != null) {
				if (line.contains("\"#\"")) {
					line = line.replace("\"#\"", "\" \"");
				} else if (line.contains("\" \"")) {
					line = line.replace("\" \"", "\"#\"");
				}

				if (line.contains("includeonbom") || line.contains("graphics")
						|| line.contains("latest")) {
					line = line
							.replace("includeonbom=\"true\"",
									"includeonbom=\"1\"")
							.replace("graphics=\"true\"", "graphics=\"1\"")
							.replace("latest=\"true\"", "latest=\"1\"")
							.replace("includeonbom=\"false\"",
									"includeonbom=\"0\"")
							.replace("graphics=\"false\"", "graphics=\"0\"")
							.replace("latest=\"false\"", "latest=\"0\"");
				}
//				System.out.println(line);
				writer.write(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.flush();
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void createImportXml(String sourceFilePath,
			String distFilePath) {
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read(new FileInputStream(new File(
					sourceFilePath)));

			DocumentFactory f = DocumentFactory.getInstance();
			Element importservice = f.createElement("importservice");
			Element imports = importservice.addElement("import");
			imports.addAttribute("content", "xml");
			imports.addAttribute("overwritecodedesc", "true");
			imports.addAttribute("scopeimport", "false");
			imports.addAttribute("overwritemode", "truncate");
			imports.addAttribute("overwritepart", "true");

			Element chssystem = imports.addElement("chssystem");
			chssystem.add(doc.getRootElement());

			Document newDoc = f.createDocument(importservice);
			OutputFormat format = OutputFormat.createPrettyPrint(); // 设置XML文档输出格式
			format.setIndent(true);
			format.setNewlines(true);
			format.setEncoding("UTF-8");
			XMLWriter w = new XMLWriter(new FileOutputStream(new File(
					distFilePath)), format);
			w.write(newDoc);
			w.flush();
			w.close();
		} catch (DocumentException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
