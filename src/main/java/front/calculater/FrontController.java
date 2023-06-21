package front.calculater;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FrontController {
    @FXML
    public Label litExp;

    public String txt = "";
    public String memory = "";
    public String numbers = "0123546789";

    public void button0Clic() {
        txt += "0";
        litExp.setText(txt);
    }

    public void button1Clic() {
        txt += "1";
        litExp.setText(txt);
    }

    public void button2Clic() {
        txt += "2";
        litExp.setText(txt);
    }

    public void button3Clic() {
        txt += "3";
        litExp.setText(txt);
    }

    public void button4Clic() {
        txt += "4";
        litExp.setText(txt);
    }

    public void button5Clic() {
        txt += "5";
        litExp.setText(txt);
    }

    public void button6Clic() {
        txt += "6";
        litExp.setText(txt);
    }

    public void button7Clic() {
        txt += "7";
        litExp.setText(txt);
    }

    public void button8Clic() {
        txt += "8";
        litExp.setText(txt);
    }

    public void button9Clic() {
        txt += "9";
        litExp.setText(txt);
    }

    public void buttonDotClic() {
        if (txt.length() != 0) {
            if (numbers.contains(String.valueOf(txt.charAt(txt.length() - 1)))) {
                txt += ".";
                litExp.setText(txt);
            }
        }
    }

    public void buttonPlusClic() {
        if (txt.length() != 0) {
            if (numbers.contains(String.valueOf(txt.charAt(txt.length() - 1)))) {
                txt += " + ";
                litExp.setText(txt);
            }
        }
    }

    public void buttonMinusClic() {
        if (txt.length() != 0) {
            if (numbers.contains(String.valueOf(txt.charAt(txt.length() - 1)))) {
                txt += " - ";
                litExp.setText(txt);
            }
        }
    }

    public void buttonMultipleClic() {
        if (txt.length() != 0) {
            if (numbers.contains(String.valueOf(txt.charAt(txt.length() - 1)))) {
                txt += " * ";
                litExp.setText(txt);
            }
        }
    }
    public void buttonDivideClic() {
        if (txt.length() != 0) {
            if (numbers.contains(String.valueOf(txt.charAt(txt.length() - 1)))) {
                txt += " / ";
                litExp.setText(txt);
            }
        }
    }

    public void buttonSuppClic() {
        if (txt.length() != 0) {
            if (txt.charAt(txt.length() - 1) == ' ')
                txt = txt.substring(0, txt.length() - 3);
            else
                txt = txt.substring(0, txt.length() - 1);
            litExp.setText(txt);
        }
    }

    public void buttonCleanClic() {
        txt = "";
        litExp.setText(txt);
    }

    public void buttonResusClic() {
        if (txt.length() == 0) {
            txt += "-";
            litExp.setText(txt);
        }
        else if (txt.charAt(txt.length() - 1) == ' ') {
            txt += "-";
            litExp.setText(txt);
        }
    }

    public void buttonEqualClic() {
        System.out.println("yoyoyoyo");
    }
    public void buttonMemoryAdd() {
        memory = txt;
    }

    public void buttonMemoryDrop() {
        txt += memory;
        litExp.setText(txt);
    }

    public void buttonMemoryDelete(){
        memory = "";
    }
}