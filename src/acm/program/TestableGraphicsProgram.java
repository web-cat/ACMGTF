package acm.program;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;

import abbot.finder.BasicFinder;
import abbot.finder.ComponentFinder;
import abbot.finder.ComponentNotFoundException;
import abbot.finder.Matcher;
import abbot.finder.MultipleComponentsFoundException;
import acm.graphics.*;
import junit.framework.Assert;
import java.util.Iterator;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import acm.program.GraphicsProgram;

public class TestableGraphicsProgram extends GraphicsProgram {

	/**
     * hasGraphicObject determines existence of a graphic object with the specified
     * parameters. Every parameter can be passed null to mean "any".
     *
     * @param shape     the shape of the object. null for any shape.
     * @param loc       the location of the object on the canvas, null for any
     *                  location.
     * @param width     the width of the object, null for any width.
     * @param height    the height of the object, null for any height.
     * @param color     the color of the object, null for any color.
     * @param visible   whether the object is visible on the canvas or not.
     *                  pass null, if either.
     *
     * @return true if it has the 2D object specified, false if not.
     */
    @SuppressWarnings("unchecked")
    public boolean hasGraphicObject(Class shape, GPoint loc, Double width, Double height, Color color, Boolean filled, Boolean visible)
	{
		Iterator iter = iterator();

        while(iter.hasNext())
        {
            GObject obj = (GObject)iter.next();
            if(obj instanceof GObject)
            {
                if((shape == null || shape.isAssignableFrom(obj.getClass())) &&
                   ((loc == null ) || (loc.equals(obj.getLocation()))) &&
                   (width == null || width.doubleValue() == obj.getWidth()) &&
                   (height == null || height.doubleValue() == obj.getHeight()) &&
                   (color == null || color.equals(obj.getColor())) &&
                   (filled == null || (GFillable.class.isAssignableFrom(obj.getClass()) && filled.booleanValue() == ((GFillable)obj).isFilled())) &&
                   (visible == null || visible.booleanValue() == obj.isVisible()))
                    return true;
            }
        }
		return false;
	}
	
	/**
     * hasGObject determines existence of a graphic object with the specified filters
     * 
     *
     * @param shape     the shape of the object. null for any shape.
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would return an an arbitrary GOval that is not filled but is visible
     *
     * @return true if it has the 2D object specified, false if not.
     */
	public boolean hasGObject(Class shape, Filter... filters)
	{
	    boolean match = false;
	    
	    Iterator iter = iterator();
        while(iter.hasNext())
        {
            match = true;
            GObject gobj = (GObject)iter.next();
            if(shape.isAssignableFrom(gobj.getClass()))
            {
                for(int i = 0; i < filters.length && match; i++)
                    match = filters[i].test(gobj);
                if(match)
                    return true;
            }
        }
	    return false;
	}

	/**
     * hasG3DRect determines existence of a G3DRect with the specified filters
     * 
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return true if it has the 2D object specified, false if not.
     */
    public boolean hasG3DRect(Filter... filters)
    {
        return hasGObject(G3DRect.class, filters);
    }
	
    /**
     * hasGArc determines existence of a GArc with the specified filters
     * 
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would return an an arbitrary GOval that is not filled but is visible
     *
     * @return true if it has the 2D object specified, false if not.
     */
    public boolean hasGArc(Filter... filters)
    {
        return hasGObject(GArc.class, filters);
    }
    
    /**
     * hasGCompound determines existence of a GCompound with the specified filters
     * 
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would return an an arbitrary GOval that is not filled but is visible
     *
     * @return true if it has the 2D object specified, false if not.
     */
    public boolean hasGCompound(Filter... filters)
    {
        return hasGObject(GCompound.class, filters);
    }

    /**
     * hasGImage determines existence of a GImage with the specified filters
     * 
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would return an an arbitrary GOval that is not filled but is visible
     *
     * @return true if it has the 2D object specified, false if not.
     */
    public boolean hasGImage(Filter... filters)
    {
        return hasGObject(GImage.class, filters);
    }
    
    /**
     * hasGLine determines existence of a GLine with the specified filters
     * 
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return true if it has the 2D object specified, false if not.
     */
    public boolean hasGLine(Filter... filters)
    {
        return hasGObject(GLine.class, filters);
    }

    /**
     * hasGOval determines existence of a GOval with the specified filters
     * 
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return true if it has the 2D object specified, false if not.
     */
    public boolean hasGOval(Filter... filters)
    {
        return hasGObject(GOval.class, filters);
    }

    /**
     * hasGPolygon determines existence of a GPolyGon with the specified filters
     * 
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return true if it has the GTurtle specified, false if not.
     */
    public boolean hasGPolygon(Filter... filters)
    {
        return hasGObject(GPolygon.class, filters);
    }
    
	/**
     * hasGRect determines existence of a GRect with the specified filters
     * 
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would return an an arbitrary GOval that is not filled but is visible
     *
     * @return true if it has the 2D object specified, false if not.
     */
    public boolean hasGRect(Filter... filters)
    {
        return hasGObject(GRect.class, filters);
    }
    
    /**
     * hasGRoundRect determines existence of a GRoundRect with the specified filters
     * 
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return true if it has the 2D object specified, false if not.
     */
    public boolean hasGRoundRect(Filter... filters)
    {
        return hasGObject(GRoundRect.class, filters);
    }
    
    /**
     * hasGTurtle determines existence of a GTurtle with the specified filters
     * 
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return true if it has the GTurtle specified, false if not.
     */
    public boolean hasGTurtle(Filter... filters)
    {
        return hasGObject(GTurtle.class, filters);
    }
    
    
    
	/**
     * hasLine returns determines the existence of a line with the specified parameters.
     * Any of the parameters can be null to mean "dont care".
     *
     * @param start     the starting point of the line, null for any starting location
     * @param end       the end location of the line, null for any end location
     * @param color     the color of the line, null for any color.
     * @param visible   whether the line is visible on the canvas or not.
     *                  pass null, if either.
     *
     * @return  true if the line exists.
     */
	public boolean hasLine(GPoint start, GPoint end, Color color, Boolean visible)
	{
		Iterator iter = iterator();
        while(iter.hasNext())
        {
            GObject obj = (GObject)iter.next();
            if(obj instanceof GLine)
            {
            	GLine x = (GLine)obj;
            	//NOTE:  .equals may not work check when testing.
                if(((start == null ) || (start.equals(x.getStartPoint()))) &&
                   ((end == null ) || (end.equals(x.getEndPoint()))) &&
                   (color == null || color.equals(x.getColor())) &&
                   (visible == null || visible.booleanValue() == x.isVisible()))
                   return true;
            }
        }
        return false;
	}

	/**
     * getGraphicObject returns an arbitrary shape that meets the specified parameters.
     * That arbitrary shape is the first one that appears in the DrawableIterator
     * for the canvas.  A null parameter can mean "any"
     *
     * @param shape     the shape of the object. null for any shape.
     * @param loc       the location of the object on the canvas, null for any
     *                  location.
     * @param width     the width of the object, null for any width.
     * @param height    the height of the object, null for any height.
     * @param color     the color of the object, null for any color.
     * @param visible   whether the object is visible on the canvas or not.
     *                  pass null, if either.
     *
     * @return an arbitrary shape that fits the parameters passed, or null
     * if no such element exists.
     */
    public GObject getGraphicObject(Class shape, GPoint loc, Double width, Double height, Color color, Boolean filled, Boolean visible)
    {
		Iterator iter = iterator();

        while(iter.hasNext())
        {
            GObject obj = (GObject)iter.next();
            if(obj instanceof GObject)
            {
                if((shape == null || shape.isAssignableFrom(obj.getClass())) &&
                   ((loc == null ) || (loc.equals(obj.getLocation()))) &&
                   (width == null || width.doubleValue() == obj.getWidth()) &&
                   (height == null || height.doubleValue() == obj.getHeight()) &&
                   (color == null || color.equals(obj.getColor())) &&
                   (filled == null || (GFillable.class.isAssignableFrom(obj.getClass()) && filled.booleanValue() == ((GFillable)obj).isFilled())) &&
                   (visible == null || visible.booleanValue() == obj.isVisible()))
                    return obj;
            }
        }
    	return null;
    }
    
    /**
     * getGObject returns an arbitrary shape that meets the specified parameters.
     * That arbitrary shape is the first one that appears in the DrawableIterator
     * for the canvas.  
     *
     * @param shape     the shape of the object. null for any shape.
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return an arbitrary shape that fits the parameters passed, or null
     * if no such element exists.
     */
    public GObject getGObject(Class shape, Filter... filters)
    {
        Iterator iter = iterator();
        boolean match = false;
        while(iter.hasNext())
        {
            match = true;
            GObject gobj = (GObject)iter.next();
            if(shape.isAssignableFrom(gobj.getClass()))
            {
                
                for(int i = 0; i < filters.length && match; i++)
                    match = filters[i].test(gobj);
                if(match)
                    return gobj;
            }
        }
        return null;
    }
    
    /**
     * getG3DRect returns an arbitrary G3DRect that meets the specified parameters.
     * That arbitrary shape is the first one that appears in the DrawableIterator
     * for the canvas.  
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return an arbitrary G3DRect that fits the parameters passed, or null
     * if no such element exists.
     */
    public G3DRect getG3DRect(Filter... filters)
    {
        return (G3DRect)getGObject(G3DRect.class, filters);
    }

    /**
     * getGArc returns an arbitrary GArc that meets the specified parameters.
     * That arbitrary shape is the first one that appears in the DrawableIterator
     * for the canvas.  
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return an arbitrary GArc that fits the parameters passed, or null
     * if no such element exists.
     */
    public GArc getGArc(Filter... filters)
    {
        return (GArc)getGObject(GArc.class, filters);
    }
    
    /**
     * getGCompound returns an arbitrary GCompound that meets the specified parameters.
     * That arbitrary shape is the first one that appears in the DrawableIterator
     * for the canvas.  
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return an arbitrary GArc that fits the parameters passed, or null
     * if no such element exists.
     */
    public GCompound getGCompound(Filter... filters)
    {
        return (GCompound)getGObject(GCompound.class, filters);
    }
    
    /**
     * getGImage returns an arbitrary GImage that meets the specified parameters.
     * That arbitrary shape is the first one that appears in the DrawableIterator
     * for the canvas.  
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return an arbitrary GImage that fits the parameters passed, or null
     * if no such element exists.
     */
    public GImage getGImage(Filter... filters)
    {
        return (GImage)getGObject(GImage.class, filters);
    }

    /**
     * getGLine returns an arbitrary GLine that meets the specified parameters.
     * That arbitrary shape is the first one that appears in the DrawableIterator
     * for the canvas.  
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return an arbitrary GLine that fits the parameters passed, or null
     * if no such element exists.
     */
    public GLine getGLine(Filter... filters)
    {
        return (GLine)getGObject(GLine.class, filters);
    }
    
    /**
     * getGOval returns an arbitrary GOval that meets the specified parameters.
     * That arbitrary shape is the first one that appears in the DrawableIterator
     * for the canvas.  
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return an arbitrary GOval that fits the parameters passed, or null
     * if no such element exists.
     */
    public GOval getGOval(Filter... filters)
    {
        return (GOval)getGObject(GOval.class, filters);
    }
    
    /**
     * getGPolygon returns an arbitrary GPolygon that meets the specified parameters.
     * That arbitrary shape is the first one that appears in the DrawableIterator
     * for the canvas.  
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return an arbitrary GPolygon that fits the parameters passed, or null
     * if no such element exists.
     */
    public GPolygon getGPolygon(Filter... filters)
    {
        return (GPolygon)getGObject(GPolygon.class, filters);
    }
    
    /**
     * getGRect returns an arbitrary GRect that meets the specified parameters.
     * That arbitrary shape is the first one that appears in the DrawableIterator
     * for the canvas.  
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return an arbitrary GRect that fits the parameters passed, or null
     * if no such element exists.
     */
    public GRect getGRect(Filter... filters)
    {
        return (GRect)getGObject(GRect.class, filters);
    }
      
    /**
     * getGRoundRect returns an arbitrary GRoundRect that meets the specified parameters.
     * That arbitrary shape is the first one that appears in the DrawableIterator
     * for the canvas.  
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return an arbitrary GRoundRect that fits the parameters passed, or null
     * if no such element exists.
     */
    public GRoundRect getGRoundRect(Filter... filters)
    {
        return (GRoundRect)getGObject(GRoundRect.class, filters);
    }
    
    /**
     * getGTurtle returns an arbitrary GTurtle that meets the specified parameters.
     * That arbitrary shape is the first one that appears in the DrawableIterator
     * for the canvas.  
     *
     * @param filters   an array of pairs of Filters and values for the filters
     *                  ex. hasGObject(GRect.class, Filter.LOCATION, new GPoint(10, 10)
     *                  would return an arbitrary GRect located at (10, 10)
     *                  ex. hasGObject(GOval.class, Filter.FILLED, false, Filter.VISIBLE, true)
     *                  would returan an arbitrary GOval that is not filled but is visible
     *
     * @return an arbitrary GRect that fits the parameters passed, or null
     * if no such element exists.
     */
    public GTurtle getGTurtle(Filter... filters)
    {
        return (GTurtle)getGObject(GTurtle.class, filters);
    }
    
    

    /**
     * getGLabelWithText returns the first GLabel with a specified string
     * 
     * @param labelText the string to search for
     *      
     * @return  a GLabel that fits the parameter passed, or null if none exists
     */
    public GLabel getGLabelWithText(String labelText)
    {
        Iterator iter = iterator();
        
        while(iter.hasNext())
        {
            Object obj = iter.next();
            if(obj instanceof GLabel)
            {
                GLabel gLabel = (GLabel)obj;
                if(gLabel.getLabel().equals(labelText))
                    return gLabel;
            }
        }
        return null;    
    }
    
    /**
     * hasGLabelWithText determines the existence of a GLabel with the specified string
     * 
     * @param labelText     the label to search for
     * 
     * @return  true if a label with the specified string is found
     */
    public boolean hasGLabelWithText(String labelText)
    {
        Iterator iter = iterator();
        
        while(iter.hasNext())
        {
            Object obj = iter.next();
            if(obj instanceof GLabel)
            {
                GLabel gLabel = (GLabel)obj;
                if(gLabel.getLabel().equals(labelText))
                    return true;
            }
        }
        
        return false;
    }
	/**
     * getLine returns an arbitrary Line object that fits the parameters that are passed to
     * the function.  A null parameter means "any."
     *
     * @param start     the starting point of the line, null for any starting location
     * @param end       the end location of the line, null for any end location
     * @param color     the color of the line, null for any color.
     * @param visible   whether the line is visible on the canvas or not.
     *                  pass null, if either.
     *
     * @return  an arbitrary Line that fits the parameters passed, or null, if no such line exists.
     */
    public GLine getLine(GPoint start, GPoint end, Color color, Boolean visible)
    {
		Iterator iter = iterator();
        while(iter.hasNext())
        {
            GObject obj = (GObject)iter.next();
            if(obj instanceof GLine)
            {
            	GLine x = (GLine)obj;
            	//NOTE:  .equals may not work check when testing.
                if(((start == null ) || (start.equals(obj.getLocation()))) &&
                   ((end == null ) || (end.equals(obj.getLocation()))) &&
                   (color == null || color.equals(obj.getColor())) &&
                   (visible == null || visible.booleanValue() == obj.isVisible()))
                   return x;
            }
        }
        return null;
    }

	/**
     * assertHasLine asserts the existence of a line with the specified parameters.
     * This method fails if no such line exists.
     *
     * @param start     the starting point of the line, null for any starting location
     * @param end       the end location of the line, null for any end location
     * @param color     the color of the line, null for any color.
     * @param visible   whether the line is visible on the canvas or not.
     *                  pass null, if either.
     *
     */
    public void assertHasLine(GPoint start, GPoint end, Color color, Boolean visible)
    {
        if(!hasLine(start, end, color, visible))
            Assert.fail();
    }

	/**
     * assertNoLine asserts the non-existence of a line with the specified parameters.
     * This method fails if such line exists.
     *
     * @param start     the starting point of the line, null for any starting location
     * @param end       the end location of the line, null for any end location
     * @param color     the color of the line, null for any color.
     * @param visible   whether the line is visible on the canvas or not.
     *                  pass null, if either.
     *
     */
    public void assertNoLine(GPoint start, GPoint end, Color color, Boolean visible)
    {
        if(hasLine(start, end, color, visible))
            Assert.fail();
    }

	/**
     * assert version of has2DObject that has a specific hint to the user.
     *
     * @param hint      error message that should be displayed for a failed assertion
     * @param shape     the shape of the object. null for any shape.
     * @param loc       the location of the object on the canvas, null for any
     *                  location.
     * @param width     the width of the object, null for any width.
     * @param height    the height of the object, null for any height.
     * @param color     the color of the object, null for any color.
     * @param visible   whether the object is visible on the canvas or not.
     *                  pass null, if either.
     */
    public void assertHas2DObject(String hint, Class shape, GPoint loc, Double width, Double height, Color color, Boolean filled, Boolean visible)
    {
        if(!hasGraphicObject(shape, loc, width, height, color, filled, visible))
            Assert.fail(hint);
    }

    /**
     * assert version of hasGObject that has a specific hint to the user.
     *
     * @param hint      error message that should be displayed for a failed assertion
     * @param filters   array of filters to use describing the object to be found
     */
    public void assertHasGObject(String hint, Class shape, Filter... filters)
    {
        if(!hasGObject(shape, filters))
            Assert.fail(hint);
    }
	/**
     * inverse of assertHas2DObject, this method will fail if an object specified
     * by the parameters is found, suceed otherwise.  Prints a custom message in
     * the event of failure.
     *
     * @param hint      error message that should be displayed for a failed assertion
     * @param shape     the shape of the object. null for any shape.
     * @param loc       the location of the object on the canvas, null for any
     *                  location.
     * @param width     the width of the object, null for any width.
     * @param height    the height of the object, null for any height.
     * @param color     the color of the object, null for any color.
     * @param visible   whether the object is visible on the canvas or not.
     *                  pass null, if either.
     *
     */
    public void assertNo2DObject(String hint, Class shape, GPoint loc, Double width, Double height, Color color, Boolean filled, Boolean visible)
    {
        if(hasGraphicObject(shape, loc, width, height, color, filled, visible))
            Assert.fail(hint);
    }
    
    
    /**
     * inverse of assertHasGObject, this method will fail if an object specified
     * by the filters is found, succeed otherwise.  Prints a custom message in
     * the event of failure.
     *
     * @param hint      error message that should be displayed for a failed assertion
     * @param filters   array of filters to use describing the object to be found
     *
     */
    public void assertNoGObject(String hint, Class shape, Filter... filters)
    {
        if(hasGObject(shape, filters))
            Assert.fail(hint);
    }

	/**
     * assertHasLine asserts the existence of a line with the specified parameters.
     * This method fails if no such line exists.  Prints a custom error message in the event
     * of failure.
     *
     * @param hint      error message that should be displayed for a failed assertion
     * @param start     the starting point of the line, null for any starting location
     * @param end       the end location of the line, null for any end location
     * @param color     the color of the line, null for any color.
     * @param visible   whether the line is visible on the canvas or not.
     *                  pass null, if either.
     *
     */
    public void assertHasLine(String hint, GPoint start, GPoint end, Color color, Boolean visible)
    {
        if(!hasLine(start, end, color, visible))
            Assert.fail(hint);
    }

	/**
     * assertNoLine asserts the non-existence of a line with the specified parameters.
     * This method fails if such line exists.  Displays a custom error message in the event
     * of failure.
     *
     * @param hint      error message that should be displayed for a failed assertion.
     * @param start     the starting point of the line, null for any starting location
     * @param end       the end location of the line, null for any end location
     * @param color     the color of the line, null for any color.
     * @param visible   whether the line is visible on the canvas or not.
     *                  pass null, if either.
     *
     */
    public void assertNoLine(String hint, GPoint start, GPoint end, Color color, Boolean visible)
    {
        if(hasLine(start, end, color, visible))
            Assert.fail(hint);
    }
    
    /**
     * assertHasGLabelWithText asserts the existence of a GLabel with the specified string.
     * This method fails if such a GLabel does not exist.  Displays a custom error message in the event
     * of failure.
     *
     * @param hint      error message that should be displayed for a failed assertion.
     * @param labelText the label text to search for
     *
     */
    public void assertHasGLabelWithText(String hint, String labelText)
    {
        if(!hasGLabelWithText(labelText))
            Assert.fail(hint);
    }
    
    /**
     * assertHasGLabelWithText asserts the non-existence of a GLabel with the specified string.
     * This method fails if such a GLabel exists.  Displays a custom error message in the event
     * of failure.
     *
     * @param hint      error message that should be displayed for a failed assertion.
     * @param labelText the label text to search for
     *
     */
    public void assertNoGLabelWithText(String hint, String labelText)
    {
        if(hasGLabelWithText(labelText))
            Assert.fail(hint);
    }
    



	public final void mouseClicked(double x, double y)
    {
		mouseClicked(new MouseEvent(this.getContentPane(),
										 MouseEvent.BUTTON1,
										 System.currentTimeMillis(),
										 MouseEvent.BUTTON1_DOWN_MASK,
										 (int) x,
										 (int)y,
										 1,
										 false));
    }


//    public final void mousePressed(double x, double y)
//    {
//		mousePressed(new MouseEvent(this.getContentPane(),
//				 MouseEvent.BUTTON1,
//				 System.currentTimeMillis(),
//				 MouseEvent.BUTTON1_DOWN_MASK,
//				 (int) x,
//				 (int)y,
//				 1,
//				 false));
//    }
	public final void mousePressed(double x, double y)
    {
	    
        eventListener.mousePressed(new MouseEvent(this.getContentPane(),
                 MouseEvent.BUTTON1,
                 System.currentTimeMillis(),
                 MouseEvent.BUTTON1_DOWN_MASK,
                 (int) x,
                 (int)y,
                 1,
                 false));
    }
   

    public final void mouseDragged(double x, double y)
    {
		eventListener.mouseDragged(new MouseEvent(this.getContentPane(),
				 MouseEvent.BUTTON1,
				 System.currentTimeMillis(),
				 MouseEvent.BUTTON1_DOWN_MASK,
				 (int) x,
				 (int)y,
				 1,
				 false));
    }

    public final void mouseReleased(double x, double y)
    {
		eventListener.mouseReleased(new MouseEvent(this.getContentPane(),
				 MouseEvent.BUTTON1,
				 System.currentTimeMillis(),
				 MouseEvent.BUTTON1_DOWN_MASK,
				 (int) x,
				 (int)y,
				 1,
				 false));
    }

    public final void mouseMoved(double x, double y)
    {
		eventListener.mouseMoved(new MouseEvent(this.getContentPane(),
				 MouseEvent.BUTTON1,
				 System.currentTimeMillis(),
				 MouseEvent.BUTTON1_DOWN_MASK,
				 (int) x,
				 (int)y,
				 1,
				 false));
    }
    
    public static abstract class Filter
    {

        
        public static final Filter location(final GPoint point)
        {
            return new Filter(){
                public boolean test(GObject gobj)
                {
                    if(gobj.getLocation().equals(point))
                        return true;
                    return false;
                }
            };
        }
        
        public static final Filter location(double x, double y)
        {
            return location(new GPoint(x, y));
        }
        
        public static final Filter width(final int width)
        {
            return new Filter(){
                public boolean test( GObject gobj )
                {
                    if(gobj.getWidth() == width)
                        return true;
                    return false;
                }
                
            };
        }
        
        public static final Filter filled = new Filter() {
            public boolean test(GObject gobj)
            {
                return GFillable.class.isAssignableFrom(gobj.getClass()) && ((GFillable)gobj).isFilled();
            }
        };
        
        public static final Filter not_filled = new Filter() {
            public boolean test(GObject gobj)
            {
                return (GFillable.class.isAssignableFrom(gobj.getClass()) && !((GFillable)gobj).isFilled());
            }
        };

        public static final Filter visible = new Filter() {
            public boolean test(GObject gobj)
            {
                return gobj.isVisible();
            }
        };
        
        public static final Filter not_visible = new Filter() {
            public boolean test(GObject gobj)
            {
                return !gobj.isVisible();
            }
        };
        
        
        
        public abstract boolean test(GObject gobj);

        


    }
}
