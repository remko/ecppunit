package be.el_tramo.ecppunit;

import java.util.regex.Matcher;

import org.eclipse.cdt.core.IMarkerGenerator;
import org.eclipse.cdt.core.errorparsers.AbstractErrorParser;
import org.eclipse.cdt.core.errorparsers.ErrorPattern;

// Note: http://eclipse-cdt.sourcearchive.com/documentation/3.1.2-1/ErrorPattern_8java-source.html
public class CPPUnitErrorParser extends AbstractErrorParser {
	private static final ErrorPattern[] patterns = {
		new ErrorPattern(".* line: (\\d+) (.*)", 2, 1, 0, 0, 0) {
			@Override
			public int getSeverity(Matcher matcher) {
				return IMarkerGenerator.SEVERITY_ERROR_RESOURCE;
			}

			@Override
			public String getDesc(Matcher matcher) {
				return "Assertion failed";
			}
		}
	};
	
	public CPPUnitErrorParser() {
		super(patterns);
	}
}
