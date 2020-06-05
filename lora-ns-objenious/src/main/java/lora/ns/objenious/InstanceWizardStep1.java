package lora.ns.objenious;

import java.util.LinkedList;

import lora.ns.connector.LNSInstanceWizardStep;
import lora.ns.connector.PropertyDescription;
import lora.ns.connector.PropertyDescription.PropertyType;

public class InstanceWizardStep1 implements LNSInstanceWizardStep {
	protected LinkedList<PropertyDescription> propertyDescriptions = new LinkedList<>();
	{
		propertyDescriptions.add(new PropertyDescription("apikey", "API Key", true, null, null, null, null, null, null, null, PropertyType.TEXT));
	}

	@Override
	public String getName() {
		return "Initial step";
	}

	@Override
	public LinkedList<PropertyDescription> getPropertyDescriptions() {
		return propertyDescriptions;
	}

}
