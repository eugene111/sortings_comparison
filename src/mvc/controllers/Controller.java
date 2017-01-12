package mvc.controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import auxialary.Auxialary;
import mvc.models.Model;
import mvc.models.data_structures.SortingData;
import mvc.views.View;

public class Controller {

    private Model model;
    private View view;
    
    private ActionListener bubleSortBntActionListener;
    private ActionListener quickSortBtnActionListener;
    private ActionListener lockInputFieldBtnActionListener;
    private ActionListener generArrayBtnActionListener;
    private ActionListener compariseBtnActionListener;
    private ActionListener heapSortBtnActionListener;
    
	private boolean editable = true;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        
        control();
        //generArrayBtn();
    }
    
    private void quickSortBtn() {
		SortingData sortData = model.sortViaQuickSort();

		view.setOutput(sortData.getStrArr());
		view.setReportOutputField("Duration (ms): " + sortData.getPeriod());
	}

	private void bubleSortBtn() {
		
		SortingData sortData = model.sortViaBubbleSort();

		view.setOutput(sortData.getStrArr());
		view.setReportOutputField("Duration (ms): " + sortData.getPeriod());
	}
	
    private void heapSortBtn() {
		SortingData sortData = model.sortViaHeapSort();

		view.setOutput(sortData.getStrArr());
		view.setReportOutputField("Duration (ms): " + sortData.getPeriod());
	}

	private void lockInpFieldBtn() {
		model.setInpArr(view.getInputField().getText());
    	if(editable) { 
    		editable = false;
    		view.getInputField().setEditable(editable);
    		view.getInputField().setBackground(Color.lightGray);
    		view.getLockInpFieldBtn().setText("Unlock Input Field");
    		
        	model.setInpArr(view.getInputField().getText());
    	} else {
    		editable = true;
    		view.getInputField().setEditable(editable);
    		view.getInputField().setBackground(Color.WHITE);
    		view.getLockInpFieldBtn().setText("Lock Input Field");
    	}
	}

	protected void compariseBtn() {
		
		String report = "";

		generRandomArray();
		SortingData heapSortData = model.sortViaHeapSort();
		report += heapSortData.getSortType() + " (ms) : " + heapSortData.getPeriod() + "\n" ;
		view.setOutput(heapSortData.getStrArr());
		view.getReportTxtArea().setText(report);
		
		generRandomArray();
		SortingData quickSortData = model.sortViaQuickSort();
		report += quickSortData.getSortType() + " (ms) : " + quickSortData.getPeriod() + "\n";
		view.setOutput(quickSortData.getStrArr());
		view.getReportTxtArea().setText(report);
		
		generRandomArray();
		SortingData bubbleSortData = model.sortViaBubbleSort();
		report += bubbleSortData.getSortType() + " (ms) : " + bubbleSortData.getPeriod();
		view.setOutput(bubbleSortData.getStrArr());
		view.getReportTxtArea().setText(report);
	}

	private void generRandomArray() {
    	view.getOutput().setText("");
    	
    	int lng = Integer.parseInt(view.getAmountField().getText());
    	model.setRandomArrayLng(lng);
    	
    	int[] randomArr = model.generateRandomArray();
    	view.getInputField().setText(Auxialary.arrayToString(randomArr));
    	

    	model.setInpArr(randomArr);
    	
    	//Locking the input field
		editable = false;
    	view.getInputField().setEditable(editable);
    	view.getInputField().setBackground(Color.lightGray);
    	view.getLockInpFieldBtn().setText("Unlock Input Field");
	}

	private void control() {
        quickSortBtnActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {  
            	quickSortBtn();
            }
        };                
        view.getQuickSortBtn().addActionListener(quickSortBtnActionListener);   

        bubleSortBntActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {                  
            	bubleSortBtn();
            }
        };                
        view.getBubleSortBtn().addActionListener(bubleSortBntActionListener);   
		
		
		generArrayBtnActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {   
			    	generRandomArray();
			    }
			};                
		view.getGenerArrayBtn().addActionListener(generArrayBtnActionListener);  
		
    	lockInputFieldBtnActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {  
            	lockInpFieldBtn();
            }
    	};                
    	view.getLockInpFieldBtn().addActionListener(lockInputFieldBtnActionListener); 
    	
    	
    	compariseBtnActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {  
            	compariseBtn();
            }
    	};                
    	view.getCompariseBtn().addActionListener(compariseBtnActionListener); 
    	
    	
    	heapSortBtnActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {  
            	heapSortBtn();
            }
    	};                
    	view.getHeapSortBtn().addActionListener(heapSortBtnActionListener); 
	}


}