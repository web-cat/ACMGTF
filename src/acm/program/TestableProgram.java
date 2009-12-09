package acm.program;

import java.awt.Component;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JLabel;

import abbot.finder.BasicFinder;
import abbot.finder.ComponentNotFoundException;
import abbot.finder.Matcher;
import abbot.finder.MultipleComponentsFoundException;
import acm.graphics.GLabel;
import junit.framework.Assert;

public class TestableProgram extends Program
{

    /**
     * getButtonWithText returns the first Button with a specified string
     * 
     * @param labelText the string to search for
     *      
     * @return  a Button that fits the parameter passed, or null if none exists
     * @throws MultipleComponentsFoundException 
     * @throws ComponentNotFoundException 
     */
    public JButton getJButtonWithText(String buttonText) throws ComponentNotFoundException, MultipleComponentsFoundException
    {
        BasicFinder finder = new BasicFinder();
        final String text = buttonText;
        
        JButton button  = (JButton)finder.find(new Matcher()
        {

            public boolean matches( Component c )
            {
                return c instanceof JButton && text.equals(((JButton)c).getText());
            }
            
        });
        return button;
        
    }
    
    
    /**
     * hasJButtonWithText   determines the existence of a JButton with the specified label
     * 
     * @param buttonText    the button text to search for
     * @return  true if a JButton with the specifed text exists
     */
    public boolean hasJButtonWithText(String buttonText)
    {
        try
        {
            return getJButtonWithText(buttonText) != null;
        }
        catch(ComponentNotFoundException cnfe)
        {
            return false;
        }
        catch(MultipleComponentsFoundException mcfe)
        {
            return true;
        }
    }
    
    /**
     * assertHasJButtonWithText asserts the existence of a JButton with the specified string.
     * This method fails if such a JButton does not exist.  Displays a custom error message in the event
     * of failure.
     *
     * @param hint      error message that should be displayed for a failed assertion.
     * @param buttonText the JButton text to search for
     *
     */
    public void assertHasJButtonWithText(String hint, String buttonText)
    {
        if(!hasJButtonWithText(buttonText))
            Assert.fail(hint);
    }
    
    /**
     * assertNoJButtonWithText asserts the non-existence of a JButton with the specified string.
     * This method fails if such a JButton exists.  Displays a custom error message in the event
     * of failure.
     *
     * @param hint      error message that should be displayed for a failed assertion.
     * @param buttonText the JButton text to search for
     *
     */
    public void assertNoJButtonWithText(String hint, String buttonText)
    {
        if(hasJButtonWithText(buttonText))
            Assert.fail(hint);
    }
    
    /**
     * getGLabelWithText returns the first GLabel with a specified string
     * 
     * @param labelText the string to search for
     *      
     * @return  a GLabel that fits the parameter passed, or null if none exists
     * @throws MultipleComponentsFoundException 
     * @throws ComponentNotFoundException 
     */
    public JLabel getJLabelWithText(String labelText) throws ComponentNotFoundException, MultipleComponentsFoundException
    {
        BasicFinder finder = new BasicFinder();
        final String text  = labelText;
        
        JLabel button  = (JLabel)finder.find(new Matcher()
        {

            public boolean matches( Component c )
            {
                return c instanceof JLabel && text.equals(((JLabel)c).getText());
            }
            
        });
        return button;
    }
    
    /**
     * hasJLabelWithText   determines the existence of a JLabel with the specified label
     * 
     * @param labelText    the label text to search for
     * @return  true if a JLabel with the specifed text exists
     */
    public boolean hasJLabelWithText(String labelText)
    {
        try
        {
            return getJLabelWithText(labelText) != null;
        }
        catch(ComponentNotFoundException cnfe)
        {
            return false;
        }
        catch(MultipleComponentsFoundException mcfe)
        {
            return true;
        }
    }
    
    /**
     * assertHasJLabelWithText asserts the existence of a JLabel with the specified string.
     * This method fails if such a JLabel does not exist.  Displays a custom error message in the event
     * of failure.
     *
     * @param hint      error message that should be displayed for a failed assertion.
     * @param labelText the JLabel text to search for
     *
     */
    public void assertHasJLabelWithText(String hint, String labelText)
    {
        if(!hasJLabelWithText(labelText))
            Assert.fail(hint);
    }
    
    /**
     * assertNoJLabelWithText asserts the non-existence of a JLabel with the specified string.
     * This method fails if such a JLabel exists.  Displays a custom error message in the event
     * of failure.
     *
     * @param hint      error message that should be displayed for a failed assertion.
     * @param labelText the JLabel text to search for
     *
     */
    public void assertNoJLabelWithText(String hint, String labelText)
    {
        if(hasJLabelWithText(labelText))
            Assert.fail(hint);
    }
}
