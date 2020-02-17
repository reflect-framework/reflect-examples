package nth.reflect.all.feature.domain;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import nth.reflect.fw.gui.style.fontawesome.FontAwesomeUrl;
import nth.reflect.fw.infrastructure.random.Random;
import nth.reflect.fw.layer1userinterface.controller.DownloadStream;
import nth.reflect.fw.layer2service.ServiceObject;
import nth.reflect.fw.layer3domain.DomainObject;
import nth.reflect.fw.layer5provider.reflection.behavior.executionmode.ExecutionMode;
import nth.reflect.fw.layer5provider.reflection.behavior.executionmode.ExecutionModeType;
import nth.reflect.fw.layer5provider.reflection.behavior.fonticon.FontIcon;
import nth.reflect.fw.layer5provider.reflection.behavior.parameterfactory.ParameterFactory;
import nth.reflect.fw.layer5provider.reflection.info.actionmethod.ActionMethod;

/**
 * {@link ServiceObject} class to domainObject all the supported {@link ActionMethod}s.
 * 
 * @author nilsth
 *
 */
@FontIcon(fontIconUrl = FontAwesomeUrl.CHECK)

public class DomainObjectService {
	private final List<DomainObject> domainObjects;
	private final DomainObjectRandomGenerator domainObjectRandomGenerator;

	public DomainObjectService(DomainObjectRandomGenerator domainObjectRandomGenerator) {
		this.domainObjectRandomGenerator = domainObjectRandomGenerator;
		domainObjects = domainObjectRandomGenerator.generateList(10, 50);
	}

	public List<DomainObject> allDomainObjects() {
		return domainObjects;
	}
	
	public List<DomainObject> allDomainObject() {
		ArrayList domainObjects2 = new ArrayList();
				domainObjects2.add(domainObjects.get(0));
		return domainObjects2;
	}

	public void createDomainObject(DomainObject domainObject) {
		domainObjects.add(domainObject);
	}

	public DomainObject createDomainObjectParameterFactory() {
		return domainObjectRandomGenerator.generate();
	}

	public void error() {
		String message = Random.chapter().generateString(10);
		throw new RuntimeException(message);
	}

	@ExecutionMode(mode = ExecutionModeType.EXECUTE_METHOD_DIRECTLY)
	public DomainObject viewDomainObject(DomainObject domainObject) {
		return domainObject;
	}

	@ExecutionMode(mode = ExecutionModeType.EDIT_PARAMETER_THEN_EXECUTE_METHOD_OR_CANCEL)
	public void modifyDomainObject(DomainObject domainObject) {
	}

	@ExecutionMode(mode = ExecutionModeType.EXECUTE_METHOD_AFTER_CONFORMATION)
	public void deleteDomainObject(DomainObject domainObject) {
		domainObjects.remove(domainObject);
	}

	public int countDomainObject() {
		return domainObjects.size();
	}

	public URI aboutTheDeveloper() {
		try {
			return new URI("http://www.linkedin.com/pub/nils-ten-hoeve/a/4b4/915");
		} catch (URISyntaxException e) {
			return null;
		}
	}

	public DownloadStream downloadDomainObjectFile() {
		String text = "This is a domainObject";
		File file = new File("DomainObject.txt");
		try {
			InputStream inputStream = new ByteArrayInputStream(text.getBytes("UTF-8"));
			return new DownloadStream(file, inputStream);
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}

	@ParameterFactory
	public DomainObjectWithHiddenProperties editDomainObjectWithHiddenProperties(DomainObjectWithHiddenProperties domainObjectWithHiddenProperties) {
		return domainObjectWithHiddenProperties;
	}

	@ParameterFactory
	public DomainObjectWithDisabledProperties editDomainObjectWithDisabledProperties(
			DomainObjectWithDisabledProperties domainObjectWithDisabledProperties) {
		return domainObjectWithDisabledProperties;
	}

}
