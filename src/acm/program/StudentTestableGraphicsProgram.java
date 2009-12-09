package acm.program;


import java.awt.*;
import junit.framework.Assert;
import java.util.Iterator;
import acm.graphics.*;
import abbot.finder.*;


/**
 * @author Jason
 *
 */
public class StudentTestableGraphicsProgram extends TestableGraphicsProgram
{
	

	// New Style Methods
    /**
     * assertFilledGArcLocatedAt asserts that there exists a filled GArc at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertFilledGArcLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a filled GRect at (" + x + ", " + y + ")";
        assertHasGObject(hint, GArc.class, Filter.location(x, y), Filter.filled);
    }
    
    /**
     * assertFilledGOvalLocatedAt asserts that there exists a filled GOval at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertFilledGOvalLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a filled GRect at (" + x + ", " + y + ")";
        assertHasGObject(hint, GOval.class, Filter.location(x, y), Filter.filled);
    }
    
    /**
     * assertFilledGRectLocatedAt asserts that there exists a filled Rect at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertFilledGRectLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a filled GRect at (" + x + ", " + y + ")";
        assertHasGObject(hint, GRect.class, Filter.location(x, y), Filter.filled);
    }
    
    /**
     * assertFilledGRoundRectLocatedAt asserts that there exists a filled GRoundRect at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertFilledGRoundRectLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a filled GRect at (" + x + ", " + y + ")";
        assertHasGObject(hint, GRoundRect.class, Filter.location(x, y), Filter.filled);
    }
    
    /**
     * assertG3DRectLocatedAt asserts that there exists a G3DRect at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertG3DRectLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a G3DRect at (" + x + ", " + y + ")";
        assertHasGObject(hint, G3DRect.class, Filter.location(x, y));
    }
    
    /**
     * assertGArcLocatedAt asserts that there exists a GArc at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertGArcLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a GArc at (" + x + ", " + y + ")";
        assertHasGObject(hint, GArc.class, Filter.location(x, y));
    }
    
    /**
     * assertGCompoundLocatedAt asserts that there exists a GCompound at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertGCompoundLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a GCompound at (" + x + ", " + y + ")";
        assertHasGObject(hint, GCompound.class, Filter.location(x, y));
    }
    
    /**
     * assertGImageLocatedAt asserts that there exists a GImage at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertGImageLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a filled GImage at (" + x + ", " + y + ")";
        assertHasGObject(hint, GImage.class, Filter.location(x, y));
    }
    
    /**
     * assertGLabelLocatedAt asserts that there exists a GLabel at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertGLabelLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a GLabel at (" + x + ", " + y + ")";
        assertHasGObject(hint, GLabel.class, Filter.location(x, y));
    }
    
    /**
     * assertGLineLocatedAt asserts that there exists a GLine at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertGLineLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a GLine at (" + x + ", " + y + ")";
        assertHasGObject(hint, GLine.class, Filter.location(x, y));
    }
    
    /**
     * assertGOvalLocatedAt asserts that there exists a GOval at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertGOvalLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a GOval at (" + x + ", " + y + ")";
        assertHasGObject(hint, GOval.class, Filter.location(x, y));
    }
    
    /**
     * assertGPolygonLocatedAt asserts that there exists a GPolygon at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertGPolygonLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a GPolygon at (" + x + ", " + y + ")";
        assertHasGObject(hint, GPolygon.class, Filter.location(x, y));
    }
    
    /**
     * assertGRectLocatedAt asserts that there exists a GRect at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertGRectLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a GRect at (" + x + ", " + y + ")";
        assertHasGObject(hint, GRect.class, Filter.location(new GPoint(x, y)));
    }
    
    /**
     * assertGRoundRectLocatedAt asserts that there exists a GRoundRect at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertGRoundRectLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a GRoundRect at (" + x + ", " + y + ")";
        assertHasGObject(hint, GRoundRect.class, Filter.location(x, y));
    }
    
    /**
     * assertGTurtleLocatedAt asserts that there exists a GTurtle at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertGTurtleLocatedAt(double x, double y)
    {
        String hint = "Canvas should have a GTurtle at (" + x + ", " + y + ")";
        assertHasGObject(hint, GTurtle.class, Filter.location(x, y));
    }
    
    // Old Style Methods
    /**
     * assertCanvasEmpty asserts there are no visible shape objects on the canvas.
     */
    public void assertCanvasEmpty()
    {
        Iterator i = iterator();
        do
        {
            if(!i.hasNext())
                break;
            GObject d = (GObject) i.next();
            if(d.isVisible())
                Assert.fail("The canvas should not have visible elements.");
        } while(true);
    }
    
    /**
     * assertNotCanvasEmpty asserts there is at least one visible element on the canvas.
     */
    public void assertCanvasNotEmpty()
    {
        for(Iterator i = iterator(); i.hasNext();)
        {
            GObject d = (GObject)i.next();
            if(d.isVisible())
                return;
        }

        Assert.fail("Canvas should have visible elements.");
    }
    /**
     * assertExistFramedRect asserts that there exists a framed, rounded rectangle at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertExistFramedRect(double x, double y)
    {
        assertHas2DObject((new StringBuilder()).append("Canvas should have a framed rectangle at (").append(x).append(",").append(y).append(").").toString(), GRect.class, new GPoint(x, y), null, null, null, null, null);
    }
    
	/**
     * assertExistFilledRect asserts that there exists a filled rectangle at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertExistFilledRect(double x, double y)
    {
        assertHas2DObject((new StringBuilder()).append("Canvas should have a filled rectangle at (").append(x).append(",").append(y).append(").").toString(), GRect.class, new GPoint(x, y), null, null, null, true, null);
    }

	/**
     * assertExistFramedArc asserts that there exists a framed arc at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertExistFramedArc(double x, double y)
    {
        assertHas2DObject((new StringBuilder()).append("Canvas should have a framed arc at (").append(x).append(",").append(y).append(").").toString(), GArc.class, new GPoint(x, y), null, null, null, null, null);
    }

	/**
     * assertExistFilledArc asserts that there exists a filled arc at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertExistFilledArc(double x, double y)
    {
        assertHas2DObject((new StringBuilder()).append("Canvas should have a filled arc at (").append(x).append(",").append(y).append(").").toString(), GArc.class, new GPoint(x, y), null, null, null, true, null);
    }

	/**
     * assertExistFramedOval asserts that there exists a framed oval at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertExistFramedOval(double x, double y)
    {
        assertHas2DObject((new StringBuilder()).append("Canvas should have a framed oval at (").append(x).append(",").append(y).append(").").toString(), GOval.class, new GPoint(x, y), null, null, null, null, null);
    }

	/**
     * assertExistFilledOval asserts that there exists a filled oval at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertExistFilledOval(double x, double y)
    {
        assertHas2DObject((new StringBuilder()).append("Canvas should have a filled oval at (").append(x).append(",").append(y).append(").").toString(), GOval.class, new GPoint(x, y), null, null, null, true, null);
    }

	/**
     * assertExistGRoundRect asserts that there exists a filled, rounded rectangle at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertExistGRoundRect(double x, double y)
    {
        assertHas2DObject((new StringBuilder()).append("Canvas should have a framed rounded rectangle at (").append(x).append(",").append(y).append(").").toString(), GRoundRect.class, new GPoint(x, y), null, null, null, null, null);
    }

	/**
     * assertExistFilledRoundedRect asserts that there exists a filled, rounded rectangle at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertExistFilledRoundedRect(double x, double y)
    {
        assertHas2DObject((new StringBuilder()).append("Canvas should have a filled rounded rectangle at (").append(x).append(",").append(y).append(").").toString(), GRoundRect.class, new GPoint(x, y), null, null, null, true, null);
    }

	/**
     * assertExistLine asserts that there exists a line starting at the specified (x, y) position
     *
     * @param startx     the x coordinate where the line begins
     * @param starty     the y coordinate where the line begins
     */
    public void assertExistLine(double startx, double starty)
    {
        assertHasLine((new StringBuilder()).append("Canvas should have a line starting at (").append(startx).append(",").append(starty).append(").").toString(), new GPoint(startx, starty), null, null, null);
    }

	/**
     * assertExistLine asserts that there exists a line connection the start and end points.
     *
     * @param startx        the x coordinate where the line begins.
     * @param starty        the y coordinate where the line begins.
     * @param endx      the x coordinate where the line ends.
     * @param endy      the y coordinate where the line ends.
     */
    public void assertExistLine(double startx, double starty, double endx, double endy)
    {
        assertHasLine((new StringBuilder()).append("Canvas should have a line starting at (").append(startx).append(",").append(starty).append(") and ending at (").append(endx).append(",").append(endy).append(").").toString(), new GPoint(startx, starty), new GPoint(endx, endy), null, null);
    }

	/**
     * assertExistText asserts that there exists a textbox at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertExistText(double x, double y)
    {
        assertHas2DObject((new StringBuilder()).append("Canvas should have a label object at (").append(x).append(",").append(y).append(").").toString(), GLabel.class, new GPoint(x, y), null, null, null, null, null);
    }

	/**
     * assertExistVisibleImage asserts that there exists a VisibleImage at the specified (x, y) position
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertExistVisibleImage(double x, double y)
    {
        assertHas2DObject((new StringBuilder()).append("Canvas should have a VisibleImage at (").append(x).append(",").append(y).append(").").toString(), GImage.class, new GPoint(x, y), null, null, null, null, null);
    }

	/**
     * assertColor asserts that the shape being evaluated has the desired color.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     * @param color     the color that is desired.
     */
    public void assertColor(double x, double y, Color color)
    {
        if(getGraphicObject(null, new GPoint(x, y), null, null, null, null, null) != null)
        {
            if(!getGraphicObject(null, new GPoint(x, y), null, null, null, null, null).getColor().equals(color))
                Assert.fail((new StringBuilder()).append("The 2D shape at (").append(x).append(",").append(y).append(") has the wrong color.  Expected ").append(color).append("but was ").append(getGraphicObject(null, new GPoint(x, y), null, null, null, null, null).getColor()).toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no 2D shape at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertVisible asserts that the shape being evaluated is visible
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     */
    public void assertVisible(double x, double y)
    {
        if(getGraphicObject(null, new GPoint(x, y), null, null, null, null, null) != null)
        {
            if(!getGraphicObject(null, new GPoint(x, y), null, null, null, null, null).isVisible())
                Assert.fail((new StringBuilder()).append("The 2D shape at (").append(x).append(",").append(y).append(") is not visible.").toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no 2D shape at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertInvisible asserts that the shape being evaluated is invisible to the canvas.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     */
    public void assertInvisible(double x, double y)
    {
        if(getGraphicObject(null, new GPoint(x, y), null, null, null, null, null) != null)
        {
            if(getGraphicObject(null, new GPoint(x, y), null, null, null, null, null).isVisible())
                Assert.fail((new StringBuilder()).append("The 2D shape at (").append(x).append(",").append(y).append(") is not invisible.").toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no 2D shape at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertWidth asserts that the shape being evaluated is a desired width.
     *
     * @param x      the x coordinats of the shape being evaluated.
     * @param y      the y coordinate of the shape being evaluated.
     * @param width     the desired width of shape
     */
    public void assertWidth(double x, double y, double width)
    {
        if(getGraphicObject(null, new GPoint(x, y), null, null, null, null, null) != null)
        {
            if(getGraphicObject(null, new GPoint(x, y), null, null, null, null, null).getWidth() != width)
                Assert.fail((new StringBuilder()).append("The 2D shape at (").append(x).append(",").append(y).append(") has the wrong width.  Expected ").append(width).append("but was ").append(getGraphicObject(null, new GPoint(x, y), null, null, null, null, null).getWidth()).toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no 2D shape at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertHeight asserts that the shape being evaluated is a desired height.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     * @param height        the desired height of shape.
     */
    public void assertHeight(double x, double y, double height)
    {
        if(getGraphicObject(null, new GPoint(x, y), null, null, null, null, null) != null)
        {
            if(getGraphicObject(null, new GPoint(x, y), null, null, null, null, null).getHeight() != height)
                Assert.fail((new StringBuilder()).append("The 2D shape at (").append(x).append(",").append(y).append(") has the wrong height.  Expected ").append(height).append("but was ").append(getGraphicObject(null, new GPoint(x, y), null, null, null, null, null).getHeight()).toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no 2D shape at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertLocationInShape asserts that the shape being evaluated includes the specified (x,y) coordinate.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     * @param xLoc     the x coordinate of the location to be tested
     * @param yLoc     the y coordinate of the location to be tested
     */
    public void assertLocationInShape(double x, double y, double xLoc, double yLoc)
    {
        if(getGraphicObject(null, new GPoint(x, y), null, null, null, null, null) != null)
        {
            if(!getGraphicObject(null, new GPoint(x, y), null, null, null, null, null).contains(new GPoint(xLoc, yLoc)))
                Assert.fail((new StringBuilder()).append("The 2D shape at (").append(x).append(",").append(y).append(") does not contain the point (").append(xLoc).append(",").append(yLoc).append(").").toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no 2D shape at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertCorrectFramedArcStartAngle asserts that the shape being evaluated has the correct starting angle.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     * @param angle     angle that is to be evaluated.
     */
    public void assertCorrectFramedArcStartAngle(double x, double y, double angle)
    {
        GArc shape = (GArc)getGraphicObject(GArc.class, new GPoint(x, y), null, null, null, null, null);
        if(shape != null && !shape.isFilled())
        {
            if(shape.getStartAngle() != angle)
                Assert.fail((new StringBuilder()).append("The Framed Arc at (").append(x).append(",").append(y).append(") has the wrong start angle.  Expected ").append(angle).append("but was ").append(shape.getStartAngle()).toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no FramedArc at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertCorrectFilledArcStartAngle asserts that the shape being evaluated has the correct starting angle.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     * @param angle     angle that is to be evaluated.
     */
    public void assertCorrectFilledArcStartAngle(double x, double y, double angle)
    {
        GArc shape = (GArc)getGraphicObject(GArc.class, new GPoint(x, y), null, null, null, true, null);
        if(shape != null && shape.isFilled())
        {
            if(shape.getStartAngle() != angle)
                Assert.fail((new StringBuilder()).append("The FilledArc at (").append(x).append(",").append(y).append(") has the wrong start angle.  Expected ").append(angle).append("but was ").append(shape.getStartAngle()).toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no FilledArc at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertCorrectFramedArcAngle asserts that the shape being evaluated spans the correct angle.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     * @param angle     angle that is to be evaluated.
     */
    public void assertCorrectFramedArcAngle(double x, double y, double angle)
    {
        GArc shape = (GArc)getGraphicObject(GArc.class, new GPoint(x, y), null, null, null, true, null);
        if(shape != null && !shape.isFilled())
        {
            if(shape.getSweepAngle() != angle)
                Assert.fail((new StringBuilder()).append("The FramedArc at (").append(x).append(",").append(y).append(") has the wrong arc angle.  Expected ").append(angle).append("but was ").append(shape.getSweepAngle()).toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no FramedArc at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertCorrectFilledArcAngle asserts that the shape being evaluated spans the correct angle.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     * @param angle     angle that is to be evaluated.
     */
    public void assertCorrectFilledArcAngle(double x, double y, double angle)
    {
        GArc shape = (GArc)getGraphicObject(GArc.class, new GPoint(x, y), null, null, null, true, null);
        if(shape != null && shape.isFilled())
        {
            if(shape.getSweepAngle() != angle)
                Assert.fail((new StringBuilder()).append("The FilledArc at (").append(x).append(",").append(y).append(") has the wrong angle.  Expected ").append(angle).append("but was ").append(shape.getSweepAngle()).toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no FilledArc at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertCorrectFrameRoundRectArcWidth asserts that the shape being evaluated has a correct corner arc width.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     * @param width     the appropriate width for shape.
     */
    public void assertCorrectFramedRoundRectArcWidth(double x, double y, double width)
    {
        GRoundRect shape = (GRoundRect)getGraphicObject(GRoundRect.class, new GPoint(x, y), null, null, null, true, null);
        if(shape != null && !shape.isFilled())
        {
            if(shape.getArcWidth() != width)
                Assert.fail((new StringBuilder()).append("The GRoundRect at (").append(x).append(",").append(y).append(") has the wrong arc width.  Expected ").append(width).append("but was ").append(shape.getArcWidth()).toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no framed GRoundRect at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertCorrectFramedRoundRectArcHeight asserts that the shape being evaluated has a correct corner arc height.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     * @param height     the appropriate height for shape.
     */
    public void assertCorrectFramedRoundRectArcHeight(double x, double y, double height)
    {
        GRoundRect shape = (GRoundRect)getGraphicObject(GRoundRect.class, new GPoint(x, y), null, null, null, true, null);
        if(shape != null && !shape.isFilled())
        {
            if(shape.getArcHeight() != height)
                Assert.fail((new StringBuilder()).append("The GRoundRect at (").append(x).append(",").append(y).append(") has the wrong arc height.  Expected ").append(height).append("but was ").append(shape.getArcHeight()).toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no framed GRoundRect at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertCorrectFilledRoundedRectArcWidth asserts that the shape being evaluated has a correct corner arc width.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     * @param width     the appropriate width for shape.
     */
    public void assertCorrectFilledRoundedRectArcWidth(double x, double y, double width)
    {
        GRoundRect shape = (GRoundRect)getGraphicObject(GRoundRect.class, new GPoint(x, y), null, null, null, true, null);
        if(shape != null && shape.isFilled())
        {
            if(shape.getArcWidth() != width)
                Assert.fail((new StringBuilder()).append("The GRoundRect at (").append(x).append(",").append(y).append(") has the wrong arc width.  Expected ").append(width).append("but was ").append(shape.getArcWidth()).toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no filled GRoundRect at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertCorrectFilledRoundedRectArcHeight asserts that the shape being evaluated has a correct corner arc height.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     * @param height     the appropriate height for shape.
     */
    public void assertCorrectFilledRoundedRectArcHeight(double x, double y, double height)
    {
        GRoundRect shape = (GRoundRect)getGraphicObject(GRoundRect.class, new GPoint(x, y), null, null, null, true, null);
        if(shape != null)
        {
            if(shape.getArcHeight() != height)
                Assert.fail((new StringBuilder()).append("The GRoundRect at (").append(x).append(",").append(y).append(") has the wrong arc height.  Expected ").append(height).append("but was ").append(shape.getArcHeight()).toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no filled GRoundRect at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertCorrectText asserts that the textbox being evaluated is displaying the correct text.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     * @param text      desired text
     */
    public void assertCorrectGLabelText(double x, double y, String text)
    {
        GLabel shape = (GLabel)getGraphicObject(GLabel.class, new GPoint(x, y), null, null, null, null, null);
        if(shape != null)
        {
            if(!shape.getLabel().equals(text))
                Assert.fail((new StringBuilder()).append("The Text at (").append(x).append(",").append(y).append(") has the wrong text.  Expected ").append(text).append("but was ").append(shape.getLabel()).toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no Text at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertCorrectFont asserts that the textbox being evaluated is displaying the correct font.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     * @param font      desired font
     */
    public void assertCorrectFont(double x, double y, Font font)
    {
        GLabel shape = (GLabel)getGraphicObject(GLabel.class, new GPoint(x, y), null, null, null, true, null);
        if(shape != null)
        {
            if(!shape.getFont().equals(font))
                Assert.fail((new StringBuilder()).append("The Text at (").append(x).append(",").append(y).append(") has the wrong font.  Expected ").append(font.toString()).append("but was ").append(shape.getFont().toString()).toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no Text at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertIsAnEndpoint asserts that a line being tested has an endpoint at the given position.
     *
     * @param x        the x coordinate of the shape being evaluated.
     * @param y        the y coordinate of the shape being evaluated.
     * @param epx     x coordinate of point
     * @param epy     y coordinate of point
     */
    public void assertIsAnEndpoint(double x, double y, double epx, double epy)
    {
        GLine shape = getLine(new GPoint(x, y), new GPoint(epx, epy), null, null);
        if(shape == null)
        {
            Assert.fail((new StringBuilder()).append("There is no Line at (").append(x).append(",").append(y).append(").").toString());
        }
    }
	
	/**
	     * assertCorrectImage asserts that the VisibleImage displayed is the correct image.
	     *
	     * @param x        the x coordinate of the shape being evaluated.
	     * @param y        the y coordinate of the shape being evaluated.
	     * @param image     the correct image to be displayed in VisibleImage.
	     */
    public void assertCorrectImage(double x, double y, Image image)
    {
        GImage shape = (GImage)getGraphicObject(GImage.class, new GPoint(x, y), null, null, null, true, null);
        if(shape != null)
        {
            if(!shape.getImage().equals(image))
                Assert.fail((new StringBuilder()).append("The Image at (").append(x).append(",").append(y).append(") has the wrong image.").toString());
        } else
        {
            Assert.fail((new StringBuilder()).append("There is no VisibleImage at (").append(x).append(",").append(y).append(").").toString());
        }
    }

	/**
     * assertColor asserts that the shape being evaluated has the desired color.
     *
     * @param shape     the shape being evaluated.
     * @param color     the color that is desired.
     */
    public void assertColor(GObject shape, Color color)
    {
        if(shape != null)
        {
            if(!shape.getColor().equals(color))
                Assert.fail((new StringBuilder()).append("The 2D shape has the wrong color.  Expected ").append(color).append("but was ").append(shape.getColor()).toString());
        } else
        {
            Assert.fail("There is no 2D shape as a parameter.");
        }
    }

	/**
     * assertVisible asserts that the shape being evaluated is visible
     *
     * @param shape     the shape being evaluated.
     */
    public void assertVisible(GObject shape)
    {
        if(shape != null)
        {
            if(!shape.isVisible())
                Assert.fail("The 2D shape is not visible.");
        } else
        {
            Assert.fail("There is no 2D shape.");
        }
    }

	/**
     * assertInvisible asserts that the shape being evaluated is invisible to the canvas.
     *
     * @param shape     the shape being evaluated.
     */
    public void assertInvisible(GObject shape)
    {
        if(shape != null)
        {
            if(shape.isVisible())
                Assert.fail("The 2D shape is not invisible.");
        } else
        {
            Assert.fail("There is no 2D shape.");
        }
    }

	/**
     * assertWidth asserts that the shape being evaluated is a desired width.
     *
     * @param shape     the shape being evaluated
     * @param width     the desired width of shape
     */
    public void assertWidth(GObject shape, double width)
    {
        if(shape != null)
        {
            if(shape.getWidth() != width)
                Assert.fail((new StringBuilder()).append("The 2D shape has the wrong width.  Expected ").append(width).append("but was ").append(shape.getWidth()).toString());
        } else
        {
            Assert.fail("There is no 2D shape.");
        }
    }

	/**
     * assertHeight asserts that the shape being evaluated is a desired height.
     *
     * @param shape     the shape being evaluated.
     * @param height        the desired height of shape.
     */
    public void assertHeight(GObject shape, double height)
    {
        if(shape != null)
        {
            if(shape.getHeight() != height)
                Assert.fail((new StringBuilder()).append("The 2D shape has the wrong height.  Expected ").append(height).append("but was ").append(shape.getHeight()).toString());
        } else
        {
            Assert.fail("There is no 2D shape.");
        }
    }

	/**
     * assertGPointInShape asserts that the shape being evaluated includes the specified (x,y) coordinate.
     *
     * @param shape     the shape being evaluated.
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public void assertGPointInShape(GObject shape, double x, double y)
    {
        if(shape != null)
        {
            if(!shape.contains(new GPoint(x, y)))
                Assert.fail("The 2D shape does not include the desired point.");
        } else
        {
            Assert.fail("There is no 2D shape.");
        }
    }

	/**
     * assertCorrectStartAngle asserts that the shape being evaluated has the correct starting angle.
     *
     * @param shape     the shape being evaluated.
     * @param angle     angle that is to be evaluated.
     */
    public void assertCorrectStartAngle(GArc shape, double angle)
    {
        if(shape != null)
        {
            if(shape.getStartAngle() != angle)
                Assert.fail((new StringBuilder()).append("The FramedArc has the wrong start angle.  Expected ").append(angle).append("but was ").append(shape.getStartAngle()).toString());
        } else
        {
            Assert.fail("There is no FramedArc.");
        }
    }

	/**
     * assertCorrectArcAngle asserts that the shape being evaluated spans the correct angle.
     *
     * @param shape     the shape being evaluated.
     * @param angle     angle that is to be evaluated.
     */
    public void assertCorrectArcAngle(GArc shape, double angle)
    {
        if(shape != null)
        {
            if(shape.getSweepAngle() != angle)
                Assert.fail((new StringBuilder()).append("The FramedArc has the wrong arc angle.  Expected ").append(angle).append("but was ").append(shape.getSweepAngle()).toString());
        } else
        {
            Assert.fail("There is no FramedArc.");
        }
    }

	/**
     * assertCorrectArcWidth asserts that the shape being evaluated has a correct corner arc width.
     *
     * @param shape     the shape being evaluated.
     * @param width     the appropriate width for shape.
     */
    public void assertCorrectArcWidth(GRoundRect shape, double width)
    {
        if(shape != null)
        {
            if(shape.getArcWidth() != width)
                Assert.fail((new StringBuilder()).append("The GRoundRect has the wrong arc width.  Expected ").append(width).append(" but was ").append(shape.getArcWidth()).toString());
        } else
        {
            Assert.fail("There is no GRoundRect.");
        }
    }

	/**
     * assertCorrectArcHeight asserts that the shape being evaluated has a correct corner arc height.
     *
     * @param shape     the shape being evaluated.
     * @param height     the appropriate height for shape.
     */
    public void assertCorrectArcHeight(GRoundRect shape, double height)
    {
        if(shape != null)
        {
            if(shape.getArcHeight() != height)
                Assert.fail((new StringBuilder()).append("The GRoundRect has the wrong arc height.  Expected ").append(height).append(" but was ").append(shape.getArcHeight()).toString());
        } else
        {
            Assert.fail("There is no GRoundRect.");
        }
    }

	/**
     * assertCorrectText asserts that the textbox being evaluated is displaying the correct text.
     *
     * @param shape     the shape being evaluated.
     * @param text      desired text
     */
    public void assertCorrectGLabelText(GLabel shape, String text)
    {
        if(shape != null)
        {
            if(!shape.getLabel().equals(text))
                Assert.fail((new StringBuilder()).append("The Text has the wrong text.  Expected ").append(text).append("but was ").append(shape.getLabel()).toString());
        } else
        {
            Assert.fail("There is no Text at.");
        }
    }

	/**
     * assertCorrectFont asserts that the textbox being evaluated is displaying the correct font.
     *
     * @param shape     the shape being evaluated.
     * @param font      desired font
     */
    public void assertCorrectFont(GLabel shape, Font font)
    {
        if(shape != null)
        {
            if(!shape.getFont().equals(font))
                Assert.fail((new StringBuilder()).append("The Text at has the wrong font.  Expected ").append(font.toString()).append(" but was ").append(shape.getFont().toString()).toString());
        } else
        {
            Assert.fail("There is no Text at.");
        }
    }

	/**
     * assertIsAnEndpoint asserts that a line being tested has an endpoint at the given position.
     *
     * @param shape     the shape being evaluated.
     * @param x     x coordinate of point
     * @param y     y coordinate of point
     */
    public void assertIsAnEndpoint(GLine shape, double x, double y)
    {
        if(shape != null)
        {
            if(!shape.getStartPoint().equals(new GPoint(x, y)) && !shape.getEndPoint().equals(new GPoint(x, y)))
                Assert.fail((new StringBuilder()).append("The Line does not have an endpoint at (").append(x).append(",").append(y).append(").").toString());
        } else
        {
            Assert.fail("There is no Line.");
        }
    }

	/**
	     * assertCorrectImage asserts that the VisibleImage displayed is the correct image.
	     *
	     * @param shape     the shape being evaluated.
	     * @param image     the correct image to be displayed in VisibleImage.
	     */
    public void assertCorrectImage(GImage shape, Image image)
    {
        if(shape != null)
        {
            if(!shape.getImage().equals(image))
                Assert.fail("The Image has the wrong image.");
        } else
        {
            Assert.fail("There is no VisibleImage.");
        }
    }
    
    
    /**
     * assertHasGLabelWithText asserts that the canvas contains a GLabel with the specified label
     * 
     * @param labelText     the label to find
     */
    public void assertHasGLabelWithText(String labelText)
    {
        assertHasGLabelWithText("No label with label " + labelText + " found.", labelText);
    }
    
    
}
