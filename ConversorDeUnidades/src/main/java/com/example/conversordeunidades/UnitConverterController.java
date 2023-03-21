package com.example.conversordeunidades;

import com.example.conversordeunidades.models.UnitConverterExchange;
import com.example.conversordeunidades.models.UnitConverterLength;
import com.example.conversordeunidades.models.UnitConverterTemperature;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.text.NumberFormat;
import java.util.Locale;

public class UnitConverterController {
    @FXML
    private TextField inputField;

    @FXML
    private TextField inputFieldEx;

    @FXML
    private TextField inputFieldTp;
    @FXML
    private ComboBox<UnitConverterLength.LengthUnits> fromUnitBoxL;

    @FXML
    private ComboBox<UnitConverterExchange.ExchangeUnits> fromUnitBoxEx;

    @FXML
    private ComboBox<UnitConverterTemperature.TempetureUnits> fromUnitBoxTp;

    @FXML
    private TextField outputField;

    @FXML
    private TextField outputFieldEx;
    @FXML
    private TextField outputFieldTp;
    @FXML
    private ComboBox<UnitConverterLength.LengthUnits> toUnitBoxL;

    @FXML
    private  ComboBox<UnitConverterExchange.ExchangeUnits> toUnitBoxEx;

    @FXML
    private ComboBox<UnitConverterTemperature.TempetureUnits> toUnitBoxTp;


    @FXML
    private Button convertButton;

    @FXML
    private Button convertButtonEx;

    @FXML
    private Button convertButtonTp;

    //METODO CONVERSOR DE DISTANCIAS MVC
    @FXML
    public void initialize() {
        fromUnitBoxL.getItems().addAll(UnitConverterLength.LengthUnits.values());//Toma todos los items de la clase Exchange
        fromUnitBoxL.getSelectionModel().select(UnitConverterLength.LengthUnits.METER); //Selecciona un item especifico para inicializar el comboBox

        toUnitBoxL.getItems().addAll(UnitConverterLength.LengthUnits.values());
        toUnitBoxL.getSelectionModel().select(UnitConverterLength.LengthUnits.KILOMETER);


        convertButton.setOnAction(e -> {
            try {
                double inputValue = Double.parseDouble(inputField.getText());  //crear variable input, coge el texto del TEXTFIELD y trasnformalo en double
                UnitConverterLength.LengthUnits fromUnit = fromUnitBoxL.getValue(); //De la clase crear una variable para atrapar el valor del item del ComboBox From
                UnitConverterLength.LengthUnits toUnit = toUnitBoxL.getValue(); //De la clase crear una variable para atrapar el valor del item del ComboBox To
                double outputValue = UnitConverterLength.convert(inputValue, fromUnit, toUnit); //crear variable local que devuelva el resultado del metodo convert de la clase
                outputField.setText(String.format("%.4f", outputValue)); //darle formato al output con el valor arrojado del TextField output
            } catch (NumberFormatException ex) {
                showErrorDialog("Por favor, ingrese un número válido.");
            }
        });
    }



    //METODO CONVERSOR DE MONEDAS MVC
    @FXML
    public void initializeExchange() {
        fromUnitBoxEx.getItems().addAll(UnitConverterExchange.ExchangeUnits.values()); //Toma todos los items de la clase Exchange
        fromUnitBoxEx.getSelectionModel().select(UnitConverterExchange.ExchangeUnits.COP); //Selecciona un item especifico para inicializar el comboBox

        toUnitBoxEx.getItems().addAll(UnitConverterExchange.ExchangeUnits.values());  //Toma todos los items de la clase Exchange
        toUnitBoxEx.getSelectionModel().select(UnitConverterExchange.ExchangeUnits.USD); //Selecciona un item especifica para inicializar el comboBox

        convertButtonEx.setOnAction(e -> {
            try {
                double inputValue = Double.parseDouble(inputFieldEx.getText());
                UnitConverterExchange.ExchangeUnits fromUnit = fromUnitBoxEx.getValue();
                UnitConverterExchange.ExchangeUnits toUnit = toUnitBoxEx.getValue();
                NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);

                double outputValue = UnitConverterExchange.convert(inputValue, fromUnit, toUnit);
                outputFieldEx.setText(nf.format(outputValue));
            } catch (NumberFormatException ex) {
                showErrorDialog("Por favor, ingrese un número válido.");
            }
        });
    }

    //METODO CONVERSOR DE TEMPERATURA MVC
    @FXML
    public void initializeTmperature() {
        fromUnitBoxTp.getItems().addAll(UnitConverterTemperature.TempetureUnits.values()); //Toma todos los items de la clase Exchange
        fromUnitBoxTp.getSelectionModel().select(UnitConverterTemperature.TempetureUnits.CENTIGRADOS); //Selecciona un item especifico para inicializar el comboBox

        toUnitBoxTp.getItems().addAll(UnitConverterTemperature.TempetureUnits.values());//Toma todos los items de la clase Exchange
        toUnitBoxTp.getSelectionModel().select(UnitConverterTemperature.TempetureUnits.FARENHEIT); //Selecciona un item especifico para inicializar el comboBox

        convertButtonTp.setOnAction(e -> {
            try {
                double inputValue = Double.parseDouble(inputFieldTp.getText());
                UnitConverterTemperature.TempetureUnits fromUnit = fromUnitBoxTp.getValue();
                UnitConverterTemperature.TempetureUnits toUnit = toUnitBoxTp.getValue();
                NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);

                double outputValue = UnitConverterTemperature.convert(inputValue, fromUnit, toUnit);
                outputFieldTp.setText(nf.format(outputValue));
            } catch (NumberFormatException ex) {
                showErrorDialog("Por favor, ingrese un número válido.");
            }
        });
    }


    private void showErrorDialog(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
