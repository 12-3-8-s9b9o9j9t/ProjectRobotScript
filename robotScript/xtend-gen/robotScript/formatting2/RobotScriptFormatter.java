/**
 * generated by Xtext 2.32.0
 */
package robotScript.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import robotScript.services.RobotScriptGrammarAccess;
import robotScriptModel.Command;
import robotScriptModel.Model;
import robotScriptModel.Rotation;

@SuppressWarnings("all")
public class RobotScriptFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private RobotScriptGrammarAccess _robotScriptGrammarAccess;

  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    EList<Command> _command = model.getCommand();
    for (final Command command : _command) {
      document.<Command>format(command);
    }
  }

  protected void _format(final Rotation rotation, @Extension final IFormattableDocument document) {
    EList<Command> _defvar = rotation.getDefvar();
    for (final Command command : _defvar) {
      document.<Command>format(command);
    }
  }

  public void format(final Object rotation, final IFormattableDocument document) {
    if (rotation instanceof Rotation) {
      _format((Rotation)rotation, document);
      return;
    } else if (rotation instanceof XtextResource) {
      _format((XtextResource)rotation, document);
      return;
    } else if (rotation instanceof Model) {
      _format((Model)rotation, document);
      return;
    } else if (rotation instanceof EObject) {
      _format((EObject)rotation, document);
      return;
    } else if (rotation == null) {
      _format((Void)null, document);
      return;
    } else if (rotation != null) {
      _format(rotation, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(rotation, document).toString());
    }
  }
}
