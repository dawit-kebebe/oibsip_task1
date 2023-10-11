package com.dawit.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.dawit.unitconverter.length.Centimeter;
import com.dawit.unitconverter.length.Foot;
import com.dawit.unitconverter.length.Inch;
import com.dawit.unitconverter.length.Kilometer;
import com.dawit.unitconverter.length.Micrometre;
import com.dawit.unitconverter.length.Mile;
import com.dawit.unitconverter.length.Millimetre;
import com.dawit.unitconverter.length.Nanometre;
import com.dawit.unitconverter.length.NauticalMile;
import com.dawit.unitconverter.length.Yard;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText textInputEditTextUnitFrom;
    private TextInputEditText textInputEditTextUnitTo;
    private Spinner categorySpinner;
    private Spinner fromSpinner;
    private Spinner toSpinner;

    private ArrayAdapter<CharSequence>
            toUnitSpinnerArrayAdapter,
            fromUnitSpinnerAdapter,
            categorySpinnerArrayAdapter;

    IConversion fromUnitObject, toUnitObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputEditTextUnitFrom = (TextInputEditText) findViewById(R.id.unit_from_in);
        textInputEditTextUnitTo = (TextInputEditText) findViewById(R.id.unit_to_out);
        categorySpinner = (Spinner) findViewById(R.id.category);

        categorySpinnerArrayAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.category,
                android.R.layout.simple_spinner_item
        );

        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.area,
                android.R.layout.simple_spinner_item
        );

         toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.area,
                android.R.layout.simple_spinner_item
        );

        categorySpinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categorySpinner.setAdapter(categorySpinnerArrayAdapter);

        fromSpinner = (Spinner) findViewById(R.id.unit_from);
        fromUnitSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromSpinner.setAdapter(fromUnitSpinnerAdapter);

        toSpinner = (Spinner) findViewById(R.id.unit_to);
        toUnitSpinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);

        categorySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    default:
                    case 0:
                        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.area,
                                android.R.layout.simple_spinner_item
                        );
                        fromSpinner.setAdapter(fromUnitSpinnerAdapter);
                        toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.area,
                                android.R.layout.simple_spinner_item
                        );
                        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);
                        break;
                    case 1:
                        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.data_transfer_rate,
                                android.R.layout.simple_spinner_item
                        );
                        fromSpinner.setAdapter(fromUnitSpinnerAdapter);
                        toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.data_transfer_rate,
                                android.R.layout.simple_spinner_item
                        );
                        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);
                        break;
                    case 2:
                        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.digital_storage,
                                android.R.layout.simple_spinner_item
                        );
                        fromSpinner.setAdapter(fromUnitSpinnerAdapter);
                        toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.digital_storage,
                                android.R.layout.simple_spinner_item
                        );
                        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);
                        break;
                    case 3:
                        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.energy,
                                android.R.layout.simple_spinner_item
                        );
                        fromSpinner.setAdapter(fromUnitSpinnerAdapter);
                        toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.energy,
                                android.R.layout.simple_spinner_item
                        );
                        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);
                        break;
                    case 4:
                        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.frequency,
                                android.R.layout.simple_spinner_item
                        );
                        fromSpinner.setAdapter(fromUnitSpinnerAdapter);
                        toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.frequency,
                                android.R.layout.simple_spinner_item
                        );
                        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);
                        break;
                    case 5:
                        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.fuel_economy,
                                android.R.layout.simple_spinner_item
                        );
                        fromSpinner.setAdapter(fromUnitSpinnerAdapter);
                        toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.fuel_economy,
                                android.R.layout.simple_spinner_item
                        );
                        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);
                        break;
                    case 6:
                        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.length,
                                android.R.layout.simple_spinner_item
                        );
                        fromSpinner.setAdapter(fromUnitSpinnerAdapter);
                        toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.length,
                                android.R.layout.simple_spinner_item
                        );
                        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);
                        break;
                    case 7:
                        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.mass,
                                android.R.layout.simple_spinner_item
                        );
                        fromSpinner.setAdapter(fromUnitSpinnerAdapter);
                        toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.mass,
                                android.R.layout.simple_spinner_item
                        );
                        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);
                        break;
                    case 8:
                        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.plane_angle,
                                android.R.layout.simple_spinner_item
                        );
                        fromSpinner.setAdapter(fromUnitSpinnerAdapter);
                        toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.plane_angle,
                                android.R.layout.simple_spinner_item
                        );
                        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);
                        break;
                    case 9:
                        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.pressure,
                                android.R.layout.simple_spinner_item
                        );
                        fromSpinner.setAdapter(fromUnitSpinnerAdapter);
                        toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.pressure,
                                android.R.layout.simple_spinner_item
                        );
                        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);
                        break;
                    case 10:
                        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.speed,
                                android.R.layout.simple_spinner_item
                        );
                        fromSpinner.setAdapter(fromUnitSpinnerAdapter);
                        toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.speed,
                                android.R.layout.simple_spinner_item
                        );
                        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);
                        break;
                    case 11:
                        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.temperature,
                                android.R.layout.simple_spinner_item
                        );
                        fromSpinner.setAdapter(fromUnitSpinnerAdapter);
                        toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.temperature,
                                android.R.layout.simple_spinner_item
                        );
                        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);
                        break;
                    case 12:
                        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.time,
                                android.R.layout.simple_spinner_item
                        );
                        fromSpinner.setAdapter(fromUnitSpinnerAdapter);
                        toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.time,
                                android.R.layout.simple_spinner_item
                        );
                        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);
                        break;
                    case 13:
                        fromUnitSpinnerAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.volume,
                                android.R.layout.simple_spinner_item
                        );
                        fromSpinner.setAdapter(fromUnitSpinnerAdapter);
                        toUnitSpinnerArrayAdapter = ArrayAdapter.createFromResource(
                                MainActivity.this,
                                R.array.volume,
                                android.R.layout.simple_spinner_item
                        );
                        toSpinner.setAdapter(toUnitSpinnerArrayAdapter);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        textInputEditTextUnitFrom.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    if (textInputEditTextUnitFrom.isFocused()){
                        double enteredUnit = Double.parseDouble(s.toString());

                        fromUnitObject = figureOutUnit(fromSpinner.getSelectedItem().toString());
                        toUnitObject = figureOutUnit(toSpinner.getSelectedItem().toString());

                        double outputUnit = (new Converter(enteredUnit, fromUnitObject, toUnitObject)).convert();

                        textInputEditTextUnitTo.setText(String.format("%.2f", outputUnit));
//                        Toast.makeText(MainActivity.this, String.valueOf(outputUnit), Toast.LENGTH_SHORT).show();
                    }

                } catch (NumberFormatException ex) {
                    Toast.makeText(MainActivity.this, ex.toString(), Toast.LENGTH_SHORT).show();
                }
            }

        });

        textInputEditTextUnitTo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    if (textInputEditTextUnitTo.isFocused()){
                        double enteredUnit = Double.parseDouble(s.toString());

                        toUnitObject = figureOutUnit(fromSpinner.getSelectedItem().toString());
                        fromUnitObject = figureOutUnit(toSpinner.getSelectedItem().toString());

                        double outputUnit = (new Converter(enteredUnit, fromUnitObject, toUnitObject)).convert();
                        textInputEditTextUnitFrom.setText(String.format("%.2f", outputUnit));
                    }
                } catch (NumberFormatException ex) {
                    Toast.makeText(MainActivity.this, ex.toString(), Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

    private IConversion figureOutUnit(String label){
        switch (label){

            case "Square Kilometer":
                break;
            case "Square Meter ":
                break;
            case "Square Mile":
                break;
            case "Square Yard":
                break;
            case "Square Foot":
                break;
            case "Square Inch":
                break;
            case "Hectare":
                break;
            case "Acre":
                break;

            case "Bit per Second ":
                break;
            case "Kilobit per second":
                break;
            case "Kilobyte per second":
                break;
            case "Kibibit per second":
                break;
            case "Megabit per second":
                break;
            case "Megabyte per second":
                break;
            case "Mebibit per second":
                break;
            case "Gigabit per second":
                break;
            case "Gigabyte per second":
                break;
            case "Gebibit per second":
                break;
            case "Terabit per second":
                break;
            case "Terabyte per second":
                break;
            case "Tebibit per second":
                break;

            case "Bit ":
                break;
            case "Kilobit":
                break;
            case "Kibibit":
                break;
            case "Megabit":
                break;
            case "Mebibit":
                break;
            case "Gigabit":
                break;
            case "Gibibit":
                break;
            case "Terabit":
                break;
            case "Petabit":
                break;
            case "Pebibit":
                break;
            case "Byte":
                break;
            case "Kilobyte":
                break;
            case "Kibibyte":
                break;
            case "Megabyte":
                break;
            case "Mebibyte":
                break;
            case "Gigabyte":
                break;
            case "Gibibyte":
                break;
            case "Terabyte":
                break;
            case "Tebibyte":
                break;
            case "Petabyte":
                break;
            case "Pebibyte":
                break;

            case "Joule ":
                break;
            case "Kilojoule":
                break;
            case "Gram calorie":
                break;
            case "Kilo calorie":
                break;
            case "Watt hour":
                break;
            case "Kilowatt hour":
                break;
            case "Electronvolt":
                break;
            case "British thermal unit":
                break;
            case "US therm":
                break;
            case "Foot-pound":
                break;

            case "Hertz ":
                break;
            case "kilohertz":
                break;
            case "Megahertz":
                break;
            case "Gigahertz":
                break;

            case "Miles per gallon":
                break;
            case "Miles per gallon (Imperial)":
                break;
            case "Kilometer per liter":
                break;
            case "Liter per 100 kilometer ":
                break;
/**
 * Length Case checking
 */
            case "Kilometre":
                return new Kilometer();
            case "Meter ":
                return null;
            case "Centimeter":
                return new Centimeter();
            case "Millimetre":
                return new Millimetre();
            case "Micrometre":
                return new Micrometre();
            case "Nanometre":
                return new Nanometre();
            case "Mile":
                return new Mile();
            case "Yard":
                return new Yard();
            case "Foot":
                return new Foot();
            case "Inch":
                return new Inch();
            case "Nautical Mile":
                return new NauticalMile();
/**
 * Mass case checking
 */
            case "Tonne":
                break;
            case "Kilogram":
                break;
            case "Gram ":
                break;
            case "Milligram":
                break;
            case "Micrograms":
                break;
            case "Imperial ton":
                break;
            case "US ton":
                break;
            case "Stone":
                break;
            case "Pound":
                break;
            case "Ounce":
                break;

            case "Arcsecond":
                break;
            case "Degree":
                break;
            case "Gradian":
                break;
            case "Milliradian":
                break;
            case "Minute of arc":
                break;
            case "Radian ":
                break;

            case "Bar":
                break;
            case "Pascal ":
                break;
            case "Pound per square inch":
                break;
            case "Standard atmosphere":
                break;
            case "Torr":
                break;

            case "Mile per hour":
                break;
            case "Foot per second":
                break;
            case "Meter per second ":
                break;
            case "Kilometer per hour":
                break;
            case "Knot":
                break;

            case "Degree Celsius ":
                break;
            case "Fahrenheit":
                break;
            case "Kelvin":
                break;

            case "Nanosecond":
                break;
            case "Microsecond":
                break;
            case "Millisecond":
                break;
            case "Second ":
                break;
            case "Minute":
                break;
            case "Hour":
                break;
            case "Day":
                break;
            case "Week":
                break;
            case "Month":
                break;
            case "Calendar Year":
                break;
            case "Decade":
                break;
            case "Century":
                break;

            case "US liquid gallon":
                break;
            case "US liquid quart":
                break;
            case "US liquid pint":
                break;
            case "US legal cup":
                break;
            case "Fluid ounce":
                break;
            case "US tablespoon":
                break;
            case "US teaspoon":
                break;
            case "Cubic meter ":
                break;
            case "Liter":
                break;
            case "Milliliter":
                break;
            case "Imperial gallon":
                break;
            case "Imperial quart":
                break;
            case "Imperial pint":
                break;
            case "Imperial cup":
                break;
            case "Imp. fluid ounce":
                break;
            case "Imperial tablespoon":
                break;
            case "Imperial teaspoon":
                break;
            case "Cubic foot":
                break;
            case "Cubic Inch":
                break;
        }

        return null;
    }
}


        
        
        
        
        
        
        
        
        
        
        
        
        