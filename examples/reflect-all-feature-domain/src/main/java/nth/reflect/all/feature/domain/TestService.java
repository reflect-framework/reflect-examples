package nth.reflect.all.feature.domain;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import nth.reflect.fw.gui.style.fontawesome.FontAwesomeUrl;
import nth.reflect.fw.infrastructure.random.Random;
import nth.reflect.fw.layer1userinterface.controller.DownloadStream;
import nth.reflect.fw.layer2service.ServiceObject;
import nth.reflect.fw.layer5provider.reflection.behavior.executionmode.ExecutionMode;
import nth.reflect.fw.layer5provider.reflection.behavior.executionmode.ExecutionModeType;
import nth.reflect.fw.layer5provider.reflection.behavior.fonticon.FontIcon;
import nth.reflect.fw.layer5provider.reflection.behavior.parameterfactory.ParameterFactory;
import nth.reflect.fw.layer5provider.reflection.info.actionmethod.ActionMethod;

/**
 * {@link ServiceObject} class to test all the supported {@link ActionMethod}s.
 * 
 * @author nilsth
 *
 */
@FontIcon(fontIconUrl = FontAwesomeUrl.CHECK)

public class TestService {
	private final List<Test> tests;
	private final TestRandomGenerator testRandomGenerator;

	public TestService(TestRandomGenerator testRandomGenerator) {
		this.testRandomGenerator = testRandomGenerator;
		tests = testRandomGenerator.generateList(10, 50);
	}

	public List<Test> allTests() {
		return tests;
	}

	public void createTest(Test test) {
		tests.add(test);
	}

	public Test createTestParameterFactory() {
		return testRandomGenerator.generate();
	}

	public void error() {
		String message = Random.chapter().generateString(10);
		throw new RuntimeException(message);
	}

	@ExecutionMode(mode = ExecutionModeType.EXECUTE_METHOD_DIRECTLY)
	public Test viewTest(Test test) {
		return test;
	}

	@ExecutionMode(mode = ExecutionModeType.EDIT_PARAMETER_THEN_EXECUTE_METHOD_OR_CANCEL)
	public void modifyTest(Test test) {
	}

	@ExecutionMode(mode = ExecutionModeType.EXECUTE_METHOD_AFTER_CONFORMATION)
	public void deleteTest(Test test) {
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
		File file = new File("Test.txt");
		try {
			InputStream inputStream = new ByteArrayInputStream(text.getBytes("UTF-8"));
			return new DownloadStream(file, inputStream);
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}

	@ParameterFactory
	public TestWithHiddenProperties editTestWithHiddenProperties(TestWithHiddenProperties testWithHiddenProperties) {
		return testWithHiddenProperties;
	}

	@ParameterFactory
	public TestWithDisabledProperties editTestWithDisabledProperties(
			TestWithDisabledProperties testWithDisabledProperties) {
		return testWithDisabledProperties;
	}

}
