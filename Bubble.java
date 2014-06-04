//   Author:   Tadhg Coffey
//   Date  :   3/26/14
//   Homework assignment : 6
//   File: Bubble.java from Draw Bubbles
//   Objective : To draw bubbles (circles) of different, size,
//      color and position when the user clicks a button. A clear
//      button deletes all.
//***************************************************************

package com.drawbubbles.drawbubbles;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Bubble
{
    public int x, y, radius, color;

    //constructor
    public Bubble(int x, int y, int radius, int color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    //*************************draw******************************
    public void draw(Canvas canvas, Paint paint)
    {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        //draw random circles: (x,y,radius,p)
        canvas.drawCircle(x,y,radius,paint);
    }

}
