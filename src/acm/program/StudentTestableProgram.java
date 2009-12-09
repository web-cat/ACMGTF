package acm.program;

import java.awt.Component;

import javax.swing.JButton;

import junit.framework.Assert;

import abbot.finder.BasicFinder;
import abbot.finder.ComponentNotFoundException;
import abbot.finder.Matcher;
import abbot.finder.MultipleComponentsFoundException;

public class StudentTestableProgram extends TestableProgram
{

    public void assertExistsJButtonWithText(String buttonText)
    {
        assertHasJButtonWithText("No button with label " + buttonText + " found.", buttonText);
    }
    
    public void assertExistsJLabelWithText(String labelText)
    {
        assertHasJLabelWithText("No label with text " + labelText + " found.", labelText);
    }
    
    
    
    
}
