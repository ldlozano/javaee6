package constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Quick simple check to validate the email address, just for the demo.
 * Not very correct.
 * 
 * @author mark
 *
 */
public class EmailConstraintValidator implements ConstraintValidator<Email, String> {

	@Override
	public void initialize(Email params) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext ctx) {
		int atIndex = value.indexOf("@");
		if (atIndex == -1) {
			return false;
		}
		
		if (value.lastIndexOf(".") < atIndex) {
			return false;
		}
		
		return true;
	}

}
