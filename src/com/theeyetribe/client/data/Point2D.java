package com.theeyetribe.client.data;

/**
 * 2D point with double precision used for gaze control routines
 */
public class Point2D 
{
	public double x;
    public double y;

	public Point2D()
    {
		x = 0;
		y = 0;
    }

    public Point2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point2D(Point2D point)
    {
        x = point.x;
        y = point.y;
    }

	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof Point2D)
		{
			Point2D other = (Point2D) o;
					
			return x == other.x && y == other.y; 
		}
		
		return false;
	}
	
	public Point2D add(Point2D p2)
	{
		return new Point2D(this.x + p2.x, this.y + p2.y);
	}
	
	public Point2D subtract(Point2D p2)
	{
		return new Point2D(this.x - p2.x, this.y - p2.y);
	}
	
	public Point2D multiply(int k)
	{
		return new Point2D(this.x * k, this.y * k);
	}
	
	public Point2D divide(int k)
	{
		return new Point2D(this.x / k, this.y / k);
	}
	
	public Point2D multiply(double k)
	{
		return new Point2D(this.x * k, this.y * k);
	}
	
	public Point2D divide(double k)
	{
		return new Point2D(this.x / k, this.y / k);
	}
	
	public double average()
	{
		return (x + y) / 2;
	}
}
