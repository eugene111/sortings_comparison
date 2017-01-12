package mvc.views;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class View {
      
    private JFrame frame;
    
    private JLabel amountLbl;
    private JTextField amountField;
    private JTextArea inputField;
    private JTextArea outputTxtArea;
    private JTextArea reportTxtArea;
    
    private JButton lockInpFieldBtn;
    
    private JButton generArrayBtn;
    private JButton bubleSortBtn;
    private JButton quickSortBtn;
    private JButton compariseBtn;
    
    private JButton heapSortBtn;
    
    private Border raisedetched = BorderFactory.createLineBorder(Color.black);
    private Border greendetched = BorderFactory.createLineBorder(Color.red);
    public View(){
        frame = new JFrame("Sorting Algorithms"); 
        GridBagLayout frameLayout = new GridBagLayout();
        frame.setLayout(frameLayout);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        frame.setSize(1400, 800);        
        frame.setVisible(true);
     
        amountLbl = new JLabel("Specify length of the RANDOM input array: ");
        amountLbl.setBorder(raisedetched);

        c.gridx = 0;
        c.gridy = 0;
        frame.add(amountLbl);
        
        amountField = new JTextField("50000", 20);
        c.gridx = 1;
        c.gridy = 0;
        frame.add(amountField);
        

        inputField = new JTextArea("Type an array of numbers separated by space", 30, 60);
        inputField.setBorder(raisedetched);
        c.gridx = 0;
        c.gridy = 1;
        inputField.setLineWrap(true);
        inputField.setWrapStyleWord(true);
        frame.add(new JScrollPane(inputField, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
       	        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS), c);
              
        outputTxtArea = new JTextArea("Output", 30, 60);
        outputTxtArea.setBorder(raisedetched);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
       	outputTxtArea.setLineWrap(true);
       	outputTxtArea.setWrapStyleWord(true);
        frame.add(new JScrollPane(outputTxtArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
       	        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS), c);
        
        reportTxtArea = new JTextArea("Report", 5, 5);
        reportTxtArea.setBorder(raisedetched);
        reportTxtArea.setEditable(false);
        c.gridwidth = 2;
        //c.gridheight = 2;
        c.gridx = 0;
        c.gridy = 2;
        reportTxtArea.setLineWrap(true);
        reportTxtArea.setWrapStyleWord(true);
        frame.add(new JScrollPane(reportTxtArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
       	        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS), c);
        
        generArrayBtn = new JButton("Generate Random Array");
        generArrayBtn.setBorder(raisedetched);
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 4;
        frame.add(generArrayBtn, c);
                
        lockInpFieldBtn = new JButton("Lock Input Field"); 
        lockInpFieldBtn.setBorder(raisedetched);
        c.gridx = 0;
        c.gridy = 5;
        frame.add(lockInpFieldBtn, c);
              
        bubleSortBtn = new JButton("Bubble Sort"); 
        bubleSortBtn.setBorder(raisedetched);
        c.gridx = 1;
        c.gridy = 4;
        frame.add(bubleSortBtn, c);
        
        quickSortBtn = new JButton("Quick Sort");   
        quickSortBtn.setBorder(raisedetched);
        c.gridx = 1;
        c.gridy = 5;
        frame.add(quickSortBtn, c);
        
        heapSortBtn = new JButton("Heap Sort");   
        heapSortBtn.setBorder(raisedetched);
        c.gridx = 1;
        c.gridy = 8;
        frame.add(heapSortBtn, c);
        
        compariseBtn = new JButton("Compare Algorithms");   
        compariseBtn.setBorder(greendetched);
        c.gridwidth = 2;
        c.ipady = 20; 
        c.gridx = 0;
        c.gridy = 9;
        frame.add(compariseBtn, c);
        

    }
        
    public JButton getBubleSortBtn(){
        return bubleSortBtn;
    }
    
    public JButton getQuickSortBtn(){
        return quickSortBtn;
    }
    
    public void setOutput(String text){
    	outputTxtArea.setText(text);
    }

	public JTextArea getOutput() {
		return outputTxtArea;
	}

	public JTextArea getInputField() {
		return inputField;
	}

	public JButton getLockInpFieldBtn() {
		return lockInpFieldBtn;
	}

	public JButton getGenerArrayBtn() {
		return generArrayBtn;
	}

	public JTextArea getReportTxtArea() {
		return reportTxtArea;
	}

	public JButton getCompariseBtn() {
		return compariseBtn;
	}

	public void setReportOutputField(String text) {
		this.reportTxtArea.setText(text);
	}

	public JTextField getAmountField() {
		return amountField;
	}

	public JButton getHeapSortBtn() {
		return heapSortBtn;
	}

}