package nth.reflect.example.domain.all.feature;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import nth.reflect.fw.layer1userinterface.controller.DownloadStream;
import nth.reflect.fw.layer2service.ServiceObject;
import nth.reflect.fw.layer5provider.reflection.behavior.executionmode.ExecutionMode;
import nth.reflect.fw.layer5provider.reflection.behavior.executionmode.ExecutionModeType;
import nth.reflect.fw.layer5provider.reflection.behavior.fonticon.FontIcon;
import nth.reflect.fw.layer5provider.reflection.info.actionmethod.ActionMethod;
import nth.reflect.fw.ui.style.fontawesome.FontAwesomeUrl;


/**
 * {@link ServiceObject} class to test all the supported {@link ActionMethod}s.
 * @author nilsth
 *
 */
@FontIcon(fontIconUrl=FontAwesomeUrl.CHECK )

public class AllFeatureSeviceObject {
	private List<AllFeatureDomainObject> tests;

	public AllFeatureSeviceObject() {
		AllFeatureDomainObject test = new AllFeatureDomainObject();
		test.setMyBoolean(true);
		test.setMyByte((byte) 1);
		test.setMyChar('z');

		test.setMyDouble(2);
		test.setMyFloat((float) 4.1);
		test.setMyInt(1001);
		test.setMyLong(28136821);
		test.setMyShort((short) 12);
		test.setMyText("text");
		test.setMyTextArea("textArea");
		test.setMyPassWord("myPassWord");
		test.setMyDate(new Date());
		// test.setMyTime(new Date());
		test.setMyDateTime(new Date());

		tests = new ArrayList<AllFeatureDomainObject>();
		tests.add(test);
	}

	public List<AllFeatureDomainObject> allTests() {
		return tests;
	}

	public void createTest(AllFeatureDomainObject test) {
		tests.add(test);
	}

	public AllFeatureDomainObject createTestParameterFactory() {
		AllFeatureDomainObject test = new AllFeatureDomainObject();
		test.setMyBoolean(true);
		test.setMyByte((byte) 1);
		test.setMyChar('n');

		test.setMyDouble(2);
		test.setMyFloat((float) 4.1);
		test.setMyInt(1001);
		test.setMyLong(28136821);
		test.setMyShort((short) 12);
		test.setMyText("new text");
		test.setMyTextArea("new textArea");
		test.setMyPassWord("new myPassWord");
		test.setMyDate(new Date());
		// test.setMyTime(new Date());
		test.setMyDateTime(new Date());
		return test;

	}

	@ExecutionMode(mode = ExecutionModeType.EXECUTE_METHOD_DIRECTLY)
	public AllFeatureDomainObject viewTest(AllFeatureDomainObject test) {
		return test;
	}

	@ExecutionMode(mode = ExecutionModeType.EDIT_PARAMETER_THEN_EXECUTE_METHOD_OR_CANCEL)
	public void modifyTest(AllFeatureDomainObject test) {
	}

	@ExecutionMode(mode = ExecutionModeType.EXECUTE_METHOD_AFTER_CONFORMATION)
	public void deleteTest(AllFeatureDomainObject test) {
		tests.remove(test);
	}

	public int countTest() {
		return tests.size();
	}

	public URI aboutTheDeveloper() {
		try {
			return new URI("http://www.linkedin.com/pub/nils-ten-hoeve/a/4b4/915");
		} catch (URISyntaxException e) {
			return null;
		}
	}

	public DownloadStream downloadTestFile() {
		String text = "This is a test";
		File file = new File("AllFeatureDomainObject.txt");
		try {
			InputStream inputStream = new ByteArrayInputStream(text.getBytes("UTF-8"));
			return new DownloadStream(file, inputStream);
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}
}
