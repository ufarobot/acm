package stanford.spl;

import acm.graphics.GObject;
import acm.util.TokenScanner;

public class GTable_getColumnWidth extends JBESwingCommand {
	public void execute(TokenScanner paramTokenScanner, JavaBackEnd paramJavaBackEnd) {
		paramTokenScanner.verifyToken("(");
		String interactorID = nextString(paramTokenScanner);
		paramTokenScanner.verifyToken(",");
		int column = nextInt(paramTokenScanner);
		paramTokenScanner.verifyToken(")");
		
		GObject localGObject = paramJavaBackEnd.getGObject(interactorID);
		if (localGObject != null && localGObject instanceof GTable) {
			GTable table = (GTable) localGObject;
			int width = table.getColumnWidth(column);
			SplPipeDecoder.writeResult(String.valueOf(width));
		}
	}
}
