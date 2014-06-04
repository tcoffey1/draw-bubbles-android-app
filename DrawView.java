//   Author:   Tadhg Coffey
//   Date  :   3/26/14
//   Homework assignment : 6
//   File: DrawView.java from Draw Bubbles
//   Objective : To draw bubbles (circles) of different, size,
//      color and position when the user clicks a button. A clear
//      button deletes all.
//***************************************************************

package com.drawbubbles.drawbubbles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

public class DrawView extends View
{
    // array list to store the drawn bubbles
    ArrayList<Bubble> bubbleList = new ArrayList<Bubble>();
    //create object of Paint
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
	
	//use 600x900 as screen default size
    int width = 600; 
    int height = 900; 

    //***********************DrawView****************************
    //constructor
    public DrawView(Context context)
    {
        super(context);
    }

    //***********************onDraw()****************************
    @Override
    public void onDraw (Canvas canvas)
    {
        super.onDraw(canvas);

        //draw random circles: (x,y,radius,p)
        paint.setStyle(Paint.Style.FILL);

        for(Bubble bubble : bubbleList)
        {
            bubble.draw(canvas,paint);
        }
    }

    //**********************addBubbble()*************************
    public void addBubble()
    {
        //create new bubble object and add to arrayList
        int randColor = Color
            .rgb(rand(0, 255), rand(0, 255), rand(0,
                255));
        Bubble bubble = new Bubble(rand(0,width),rand(0,height),
            rand(2,75),randColor);
        bubbleList.add(bubble);
    }

    //*************************clear()***************************
    public void clear()
    {
        bubbleList.clear();
    }

    //**************************rand()***************************
    public int rand(int a, int b)
    {
        return((int)((b-a+1)*Math.random() + a));
    }

}//end DrawView Class
