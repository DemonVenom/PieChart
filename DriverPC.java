
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class DriverPC {

    public static void main(String[] args) {

        // Create new scanner object
        Scanner scnr = new Scanner(System.in);

        // Prompt the user for the first slice value
        System.out.print("What is the integer for pie slice 1 (red)?: ");
        // ...and place into integer variable
        int slice1 = scnr.nextInt();

        // Prompt the user for the second slice
        System.out.print("What is the integer for pie slice 2 (blue)?: ");
        // ...and place into integer variable
        int slice2 = scnr.nextInt();

        // Prompt the user for the third slice
        System.out.print("What is the integer for pie slice 3 (green)?: ");
        // ...and place into integer variable
        int slice3 = scnr.nextInt();

        // Prompt the user for the fourth slice
        System.out.print("What is the integer for pie slice 4 (pink)?: ");
        // ...and place into integer variable
        int slice4 = scnr.nextInt();

        // Calculate sum of all slice values
        double sum = slice1 + slice2 + slice3 + slice4;

        // Get slice degree length value
        double pieSlice1 = (slice1 / sum) * 360;
        double pieSlice2 = (slice2 / sum) * 360;
        double pieSlice3 = (slice3 / sum) * 360;
        double pieSlice4 = (slice4 / sum) * 360;

        // Create new PieChart object
        PieChart pieChart = new PieChart();

        // set pie chart degree values
        pieChart.setPieSlice1(pieSlice1);
        pieChart.setPieSlice2(pieSlice2);
        pieChart.setPieSlice3(pieSlice3);
        pieChart.setPieSlice4(pieSlice4);


        // Create new frame to store the pie chart
        JFrame frame = new JFrame("Draw Arc Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(pieChart);
        frame.pack();
        frame.setSize(new Dimension(420, 450));
        frame.setVisible(true);
    }




}
