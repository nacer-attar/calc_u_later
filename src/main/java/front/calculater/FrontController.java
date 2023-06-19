package front.calculater;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FrontController {
    public Label litExp;
    public String txt = "";
    public char last_input;
    public void button0Clic() {
        this.txt += "0";
        litExp.setText(txt);
        this.last_input = '0';
    }

    public void button1Clic() {
        this.txt += "1";
        litExp.setText(txt);
        this.last_input = '1';
    }

    public void button2Clic() {
        this.txt += "2";
        litExp.setText(txt);
        this.last_input = '2';
    }

    public void button3Clic() {
        this.txt += "3";
        litExp.setText(txt);
        this.last_input = '3';
    }

    public void button4Clic() {
        this.txt += "4";
        litExp.setText(txt);
        this.last_input = '4';
    }

    public void button5Clic() {
        this.txt += "5";
        litExp.setText(txt);
        this.last_input = '5';
    }

    public void button6Clic() {
        this.txt += "6";
        litExp.setText(txt);
        this.last_input = '6';
    }

    public void button7Clic() {
        this.txt += "7";
        litExp.setText(txt);
        this.last_input = '7';
    }

    public void button8Clic() {
        this.txt += "8";
        litExp.setText(txt);
        this.last_input = '8';
    }

    public void button9Clic() {
        this.txt += "9";
        litExp.setText(txt);
        this.last_input = '9';
    }

    public void buttonDotClic() {
        this.txt += ".";
        litExp.setText(txt);
        this.last_input = '.';
    }

    public void buttonPlusClic() {
        this.txt += " + ";
        litExp.setText(txt);
        this.last_input = '+';
    }

    public void buttonMinusClic() {
        this.txt += " - ";
        litExp.setText(txt);
        this.last_input = '-';
    }

    public void buttonMultipleClic() {
        this.txt += " * ";
        litExp.setText(txt);
        this.last_input = '*';
    }

    public void buttonDivideClic() {
        this.txt += " / ";
        litExp.setText(txt);
        this.last_input = '/';
    }

    public void buttonSuppClic() {
        if (this.txt.length() != 0) {
            if (this.txt.charAt(this.txt.length() - 1) == ' ')
                this.txt = this.txt.substring(0, this.txt.length() - 3);
            else
                this.txt = this.txt.substring(0, this.txt.length() - 1);
            litExp.setText(txt);
        }
        this.last_input = 'X';
    }

    public void buttonCleanClic() {
        this.txt = "";
        litExp.setText(txt);
        this.last_input = 'C';
    }
}