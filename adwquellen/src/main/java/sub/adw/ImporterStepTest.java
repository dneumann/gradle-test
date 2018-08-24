package sub.adw;

import java.util.Map;

import sub.ent.api.ImporterStep;

public class ImporterStepTest extends ImporterStep {

	@Override
	public void execute(Map<String, String> params) {
		out.println("    in test step");
	}

	@Override
	public String getStepDescription() {
		return "Test-step";
	}

}
