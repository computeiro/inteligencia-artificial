package computeiro.rosenblattneuron.ui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MatrixConstants {
    public static int[][] A = new int[][]{
  		{  -1,  -1,  -1,   1,  -1,  -1,  -1} , 
  		{  -1,  -1,   1,  -1,   1,  -1,  -1} , 
  		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
  		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
  		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
  		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
  		{  -1,   1,   1,   1,   1,   1,  -1} , 
  		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
  		{  -1,   1,  -1,  -1,  -1,   1,  -1}
    } ;
      
    public static int[][] B = new int[][]{
		{   1,   1,   1,   1,   1,  -1,  -1} , 
		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
		{  -1,   1,   1,   1,   1,  -1,  -1} , 
		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
		{   1,   1,   1,   1,   1,  -1,  -1} 
    };
    
    public static int[][] C = new int[][]{
		{  -1,  -1,   1,   1,   1,  -1,  -1} , 
		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
		{   1,  -1,  -1,  -1,  -1,  -1,  -1} , 
		{   1,  -1,  -1,  -1,  -1,  -1,  -1} , 
		{   1,  -1,  -1,  -1,  -1,  -1,  -1} , 
		{   1,  -1,  -1,  -1,  -1,  -1,  -1} , 
		{   1,  -1,  -1,  -1,  -1,  -1,  -1} , 
		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
		{  -1,  -1,   1,   1,   1,  -1,  -1} 
    }; 

    public static int[][] D = new int[][]{
		{   1,   1,   1,   1,  -1,  -1,  -1} , 
		{  -1,   1,  -1,  -1,   1,  -1,  -1} , 
		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
		{  -1,   1,  -1,  -1,  -1,   1,  -1} , 
		{  -1,   1,  -1,  -1,   1,  -1,  -1} , 
		{   1,   1,   1,   1,  -1,  -1,  -1}
    };
    
    public static int[][] NRO0 = new int[][]
    {
    	{-1, -1,  1,  1,  1, -1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1, -1,  1,  1,  1, -1, -1}
    };
    
    
    public static int[][] NRO1 = new int[][]
    {
    	{-1, -1, -1,  1, -1, -1, -1},
    	{-1, -1,  1,  1, -1, -1, -1},
    	{-1,  1,  1,  1, -1, -1, -1},
    	{-1, -1, -1,  1, -1, -1, -1},
    	{-1, -1, -1,  1, -1, -1, -1},
    	{-1, -1, -1,  1, -1, -1, -1},
    	{-1, -1, -1,  1, -1, -1, -1},
    	{-1, -1, -1,  1, -1, -1, -1},
    	{-1,  1,  1,  1,  1,  1, -1}
    };
    
    public static int[][] NRO2 = new int[][]
    {
    	{-1, -1,  1,  1,  1, -1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1, -1, -1, -1, -1,  1, -1},
    	{-1, -1, -1, -1, -1,  1, -1},
    	{-1, -1, -1, -1,  1, -1, -1},
    	{-1, -1, -1,  1, -1, -1, -1},
    	{-1, -1,  1, -1, -1, -1, -1},
    	{-1,  1, -1, -1, -1, -1, -1},
    	{-1,  1,  1,  1,  1,  1, -1}
    };
    
    public static int[][] NRO3 = new int[][]
    {
    	{-1, -1,  1,  1,  1, -1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1, -1, -1, -1, -1,  1, -1},
    	{-1, -1, -1, -1, -1,  1, -1},
    	{-1, -1,  1,  1,  1, -1, -1},
    	{-1, -1, -1, -1, -1,  1, -1},
    	{-1, -1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1, -1,  1,  1,  1, -1, -1}
    };

    public static int[][] NRO4 = new int[][]
    {
    	{-1,  1, -1, -1,  1, -1, -1},
    	{-1,  1, -1, -1,  1, -1, -1},
    	{-1,  1, -1, -1,  1, -1, -1},
    	{-1,  1, -1, -1,  1, -1, -1},
    	{-1,  1, -1, -1,  1, -1, -1},
    	{-1,  1,  1,  1,  1,  1, -1},
    	{-1, -1, -1, -1,  1, -1, -1},
    	{-1, -1, -1, -1,  1, -1, -1},
    	{-1, -1, -1, -1,  1, -1, -1}
    };
    
    public static int[][] NRO5 = new int[][]
    {
    	{-1,  1,  1,  1,  1,  1, -1},
    	{-1,  1, -1, -1, -1, -1, -1},
    	{-1,  1, -1, -1, -1, -1, -1},
    	{-1,  1, -1, -1, -1, -1, -1},
    	{-1,  1,  1,  1,  1, -1, -1},
    	{-1, -1, -1, -1, -1,  1, -1},
    	{-1, -1, -1, -1, -1,  1, -1},
    	{-1, -1, -1, -1, -1,  1, -1},
    	{-1,  1,  1,  1,  1, -1, -1}
    };
    
    public static int[][] NRO6 = new int[][]
    {
    	{-1, -1,  1,  1,  1, -1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1, -1, -1},
    	{-1,  1, -1, -1, -1, -1, -1},
    	{-1,  1,  1,  1,  1, -1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1, -1,  1,  1,  1, -1, -1}
    };
    
    public static int[][] NRO7 = new int[][]
    {
    	{-1,  1,  1,  1,  1, -1, -1},
    	{-1, -1, -1, -1, -1,  1, -1},
    	{-1, -1, -1, -1, -1,  1, -1},
    	{-1, -1, -1, -1,  1, -1, -1},
    	{-1, -1, -1, -1,  1, -1, -1},
    	{-1, -1, -1,  1, -1, -1, -1},
    	{-1, -1, -1,  1, -1, -1, -1},
    	{-1, -1,  1, -1, -1, -1, -1},
    	{-1, -1,  1, -1, -1, -1, -1}
    };
    
    public static int[][] NRO8 = new int[][]
    {
    	{-1, -1,  1,  1,  1, -1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1, -1,  1,  1,  1, -1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1, -1,  1,  1,  1, -1, -1}
    };
    
    
    public static int[][] NRO9 = new int[][]
    {
    	{-1, -1,  1,  1,  1, -1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1, -1,  1,  1,  1,  1, -1},
    	{-1, -1, -1, -1, -1,  1, -1},
    	{-1, -1, -1, -1, -1,  1, -1},
    	{-1,  1, -1, -1, -1,  1, -1},
    	{-1, -1,  1,  1,  1, -1, -1}
    };
}
