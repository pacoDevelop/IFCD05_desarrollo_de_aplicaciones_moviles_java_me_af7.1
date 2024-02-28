package model;

import oracle.adf.model.datacontrols.device.DeviceManager;
import oracle.adf.model.datacontrols.device.DeviceManagerFactory;
import oracle.adfmf.amx.event.ActionEvent;

public class emailBean {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public emailBean() {
	}

	public void sendEmail(ActionEvent actionEvent) {
		DeviceManager deviceManager = DeviceManagerFactory.getDeviceManager();
		deviceManager.sendEmail("Gary@oracle.com", // to
				"", 							   // cc
				"An email",                        // subject
				"Hello from my MAF application",   // body
				"",                                // bcc
				"",                                // attachments
				""                                 // mimeTypes
		);
	}
}