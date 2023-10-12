package com.dawit.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.dawit.unitconverter.Frequency.GigaHertz;
import com.dawit.unitconverter.Frequency.Hertz;
import com.dawit.unitconverter.Frequency.KiloHertz;
import com.dawit.unitconverter.Frequency.MegaHertz;
import com.dawit.unitconverter.area.Acre;
import com.dawit.unitconverter.area.Hectare;
import com.dawit.unitconverter.area.SquareFoot;
import com.dawit.unitconverter.area.SquareInch;
import com.dawit.unitconverter.area.SquareKilometer;
import com.dawit.unitconverter.area.SquareMeter;
import com.dawit.unitconverter.area.SquareMile;
import com.dawit.unitconverter.area.SquareYard;
import com.dawit.unitconverter.data_transfer_rate.BitPerSecond;
import com.dawit.unitconverter.data_transfer_rate.GebibitPerSecond;
import com.dawit.unitconverter.data_transfer_rate.GigabitPerSecond;
import com.dawit.unitconverter.data_transfer_rate.GigabytePerSecond;
import com.dawit.unitconverter.data_transfer_rate.KibibitPerSecond;
import com.dawit.unitconverter.data_transfer_rate.KilobitPerSecond;
import com.dawit.unitconverter.data_transfer_rate.KilobytePerSecond;
import com.dawit.unitconverter.data_transfer_rate.MebibitPerSecond;
import com.dawit.unitconverter.data_transfer_rate.MegabitPersecond;
import com.dawit.unitconverter.data_transfer_rate.MegabytePerSecond;
import com.dawit.unitconverter.data_transfer_rate.TebibitPerSecond;
import com.dawit.unitconverter.data_transfer_rate.TerabitPerSecond;
import com.dawit.unitconverter.data_transfer_rate.TerabytePerSecond;
import com.dawit.unitconverter.digital_storage.Bit;
import com.dawit.unitconverter.digital_storage.Gibibit;
import com.dawit.unitconverter.digital_storage.Gibibyte;
import com.dawit.unitconverter.digital_storage.Gigabit;
import com.dawit.unitconverter.digital_storage.Gigabyte;
import com.dawit.unitconverter.digital_storage.Kibibit;
import com.dawit.unitconverter.digital_storage.Kibibyte;
import com.dawit.unitconverter.digital_storage.Kilobit;
import com.dawit.unitconverter.digital_storage.Kilobyte;
import com.dawit.unitconverter.digital_storage.Mebibit;
import com.dawit.unitconverter.digital_storage.Mebibyte;
import com.dawit.unitconverter.digital_storage.Megabit;
import com.dawit.unitconverter.digital_storage.Megabyte;
import com.dawit.unitconverter.digital_storage.Pebibit;
import com.dawit.unitconverter.digital_storage.Pebibyte;
import com.dawit.unitconverter.digital_storage.Petabit;
import com.dawit.unitconverter.digital_storage.Petabyte;
import com.dawit.unitconverter.digital_storage.Tebibyte;
import com.dawit.unitconverter.digital_storage.Terabit;
import com.dawit.unitconverter.digital_storage.Terabyte;
import com.dawit.unitconverter.energy.BritishTermalUnit;
import com.dawit.unitconverter.energy.ElectronVolt;
import com.dawit.unitconverter.energy.FootPound;
import com.dawit.unitconverter.energy.GramCalorie;
import com.dawit.unitconverter.energy.Joule;
import com.dawit.unitconverter.energy.KiloCalorie;
import com.dawit.unitconverter.energy.KiloWattHour;
import com.dawit.unitconverter.energy.Kilojoule;
import com.dawit.unitconverter.energy.UsTherm;
import com.dawit.unitconverter.energy.WattHour;
import com.dawit.unitconverter.fuel_economy.KiloMeterPerLiter;
import com.dawit.unitconverter.fuel_economy.LiterPer100Kilometer;
import com.dawit.unitconverter.fuel_economy.MilesPerGallon;
import com.dawit.unitconverter.fuel_economy.MilesPerGallon_Imperial;
import com.dawit.unitconverter.length.Centimeter;
import com.dawit.unitconverter.length.Foot;
import com.dawit.unitconverter.length.Inch;
import com.dawit.unitconverter.length.Kilometer;
import com.dawit.unitconverter.length.Meter;
import com.dawit.unitconverter.length.Micrometer;
import com.dawit.unitconverter.length.Mile;
import com.dawit.unitconverter.length.Milimeter;
import com.dawit.unitconverter.length.Nanometer;
import com.dawit.unitconverter.length.NauticalMile;
import com.dawit.unitconverter.length.Yard;
import com.dawit.unitconverter.mass.Gram;
import com.dawit.unitconverter.mass.ImperialTon;
import com.dawit.unitconverter.mass.KiloGram;
import com.dawit.unitconverter.mass.Microgram;
import com.dawit.unitconverter.mass.Miligram;
import com.dawit.unitconverter.mass.Ounce;
import com.dawit.unitconverter.mass.Pound;
import com.dawit.unitconverter.mass.Stone;
import com.dawit.unitconverter.mass.Tonne;
import com.dawit.unitconverter.mass.UsTon;
import com.dawit.unitconverter.plane_angle.Arcsecond;
import com.dawit.unitconverter.plane_angle.Degree;
import com.dawit.unitconverter.plane_angle.Gradian;
import com.dawit.unitconverter.plane_angle.MilliRadian;
import com.dawit.unitconverter.plane_angle.MinuteOfArc;
import com.dawit.unitconverter.plane_angle.Radian;
import com.dawit.unitconverter.pressure.Bar;
import com.dawit.unitconverter.pressure.Pascal;
import com.dawit.unitconverter.pressure.PoundPerSquareInch;
import com.dawit.unitconverter.pressure.StandardAtmosphere;
import com.dawit.unitconverter.pressure.Torr;
import com.dawit.unitconverter.speed.FootPerSecond;
import com.dawit.unitconverter.speed.KilometerPerHour;
import com.dawit.unitconverter.speed.Knot;
import com.dawit.unitconverter.speed.MeterPerSecond;
import com.dawit.unitconverter.speed.MilePerHour;
import com.dawit.unitconverter.temprature.DegreeCelsius;
import com.dawit.unitconverter.temprature.Fahrenhiet;
import com.dawit.unitconverter.temprature.Kelvin;
import com.dawit.unitconverter.time.CalenderYear;
import com.dawit.unitconverter.time.Century;
import com.dawit.unitconverter.time.Day;
import com.dawit.unitconverter.time.Decade;
import com.dawit.unitconverter.time.Hour;
import com.dawit.unitconverter.time.MicroSecond;
import com.dawit.unitconverter.time.MilliSecond;
import com.dawit.unitconverter.time.Minute;
import com.dawit.unitconverter.time.Month;
import com.dawit.unitconverter.time.NanoSecond;
import com.dawit.unitconverter.time.Second;
import com.dawit.unitconverter.time.Week;
import com.dawit.unitconverter.volume.CubicFoot;
import com.dawit.unitconverter.volume.CubicInch;
import com.dawit.unitconverter.volume.CubicMeter;
import com.dawit.unitconverter.volume.FluidOunce;
import com.dawit.unitconverter.volume.Imp_FluidOunce;
import com.dawit.unitconverter.volume.ImperialCup;
import com.dawit.unitconverter.volume.ImperialGallon;
import com.dawit.unitconverter.volume.ImperialQuart;
import com.dawit.unitconverter.volume.ImperialPint;
import com.dawit.unitconverter.volume.ImperialTableSpoon;
import com.dawit.unitconverter.volume.ImperialTeaSpoon;
import com.dawit.unitconverter.volume.Liter;
import com.dawit.unitconverter.volume.MilliLiter;
import com.dawit.unitconverter.volume.UsLegalCup;
import com.dawit.unitconverter.volume.UsLiquidGallon;
import com.dawit.unitconverter.volume.UsLiquidPint;
import com.dawit.unitconverter.volume.UsLiquidQuart;
import com.dawit.unitconverter.volume.UsTableSpoon;
import com.dawit.unitconverter.volume.UsTeaSpoon;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText textInputEditTextUnitFrom;
    private TextInputEditText textInputEditTextUnitTo;
    private Spinner fromSpinner;
    private Spinner toSpinner;

    private ArrayAdapter<CharSequence>
            toUnitSpinnerArrayAdapter;
    private ArrayAdapter<CharSequence> fromUnitSpinnerAdapter;

    IConversion fromUnitObject, toUnitObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputEditTextUnitFrom = findViewById(R.id.unit_from_in);
        textInputEditTextUnitTo = findViewById(R.id.unit_to_out);
        Spinner categorySpinner = findViewById(R.id.category);

        ArrayAdapter<CharSequence> categorySpinnerArrayAdapter = ArrayAdapter.createFromResource(
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

        fromSpinner = findViewById(R.id.unit_from);
        fromUnitSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromSpinner.setAdapter(fromUnitSpinnerAdapter);

        toSpinner = findViewById(R.id.unit_to);
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
                    textInputEditTextUnitTo.setText("");
//                    Toast.makeText(MainActivity.this, ex.toString(), Toast.LENGTH_SHORT).show();
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
                    textInputEditTextUnitFrom.setText("");
//                    Toast.makeText(MainActivity.this, ex.toString(), Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

    private IConversion figureOutUnit(String label){
        switch (label.trim()){
//Area
            case "Square Kilometer":
                return new SquareKilometer();
            case "Square Meter":
                return new SquareMeter();
            case "Square Mile":
                return new SquareMile();
            case "Square Yard":
                return new SquareYard();
            case "Square Foot":
                return new SquareFoot();
            case "Square Inch":
                return new SquareInch();
            case "Hectare":
                return new Hectare();
            case "Acre":
                return new Acre();
//Data Transfer rate
            case "Bit per Second":
                return new BitPerSecond();
            case "Kilobit per second":
                return new KilobitPerSecond();
            case "Kilobyte per second":
                return new KilobytePerSecond();
            case "Kibibit per second":
                return new KibibitPerSecond();
            case "Megabit per second":
                return new MegabitPersecond();
            case "Megabyte per second":
                return new MegabytePerSecond();
            case "Mebibit per second":
                return new MebibitPerSecond();
            case "Gigabit per second":
                return new GigabitPerSecond();
            case "Gigabyte per second":
                return new GigabytePerSecond();
            case "Gebibit per second":
                return new GebibitPerSecond();
            case "Terabit per second":
                return new TerabitPerSecond();
            case "Terabyte per second":
                return new TerabytePerSecond();
            case "Tebibit per second":
                return new TebibitPerSecond();
//Digital Storage
            case "Bit":
                return new Bit();
            case "Kilobit":
                return new Kilobit();
            case "Kibibit":
                return new Kibibit();
            case "Megabit":
                return new Megabit();
            case "Mebibit":
                return new Mebibit();
            case "Gigabit":
                return new Gigabit();
            case "Gibibit":
                return new Gibibit();
            case "Terabit":
                return new Terabit();
            case "Petabit":
                return new Petabit();
            case "Pebibit":
                return new Pebibit();
            case "Byte":
                return new com.dawit.unitconverter.digital_storage.Byte();
            case "Kilobyte":
                return new Kilobyte();
            case "Kibibyte":
                return new Kibibyte();
            case "Megabyte":
                return new Megabyte();
            case "Mebibyte":
                return new Mebibyte();
            case "Gigabyte":
                return new Gigabyte();
            case "Gibibyte":
                return new Gibibyte();
            case "Terabyte":
                return new Terabyte();
            case "Tebibyte":
                return new Tebibyte();
            case "Petabyte":
                return new Petabyte();
            case "Pebibyte":
                return new Pebibyte();
//Energy
            case "Joule":
                return new Joule();
            case "Kilojoule":
                return new Kilojoule();
            case "Gram calorie":
                return new GramCalorie();
            case "Kilo calorie":
                return new KiloCalorie();
            case "Watt hour":
                return new WattHour();
            case "Kilowatt hour":
                return new KiloWattHour();
            case "Electronvolt":
                return new ElectronVolt();
            case "British thermal unit":
                return new BritishTermalUnit();
            case "US therm":
                return new UsTherm();
            case "Foot-pound":
                return new FootPound();
//Frequency
            case "Hertz":
                return new Hertz();
            case "kilohertz":
                return new KiloHertz();
            case "Megahertz":
                return new MegaHertz();
            case "Gigahertz":
                return new GigaHertz();
//Fuel Economy
            case "Miles per gallon":
                return new MilesPerGallon();
            case "Miles per gallon (Imperial)":
                return new MilesPerGallon_Imperial();
            case "Kilometer per liter":
                return new KiloMeterPerLiter();
            case "Liter per 100 kilometer":
                return new LiterPer100Kilometer();

//Length Case checking

            case "Kilometre":
                return new Kilometer();
            case "Meter ":
                return new Meter();
            case "Centimeter":
                return new Centimeter();
            case "Millimetre":
                return new Milimeter();
            case "Micrometre":
                return new Micrometer();
            case "Nanometre":
                return new Nanometer();
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

 // Mass case checking

            case "Tonne":
                return new Tonne();
            case "Kilogram":
                return new KiloGram();
            case "Gram":
                return new Gram();
            case "Milligram":
                return new Miligram();
            case "Micrograms":
                return new Microgram();
            case "Imperial ton":
                return new ImperialTon();
            case "US ton":
                return new UsTon();
            case "Stone":
                return new Stone();
            case "Pound":
                return new Pound();
            case "Ounce":
                return new Ounce();
//Plane Angle
            case "Arcsecond":
                return new Arcsecond();
            case "Degree":
                return new Degree();
            case "Gradian":
                return new Gradian();
            case "Milliradian":
                return new MilliRadian();
            case "Minute of arc":
                return new MinuteOfArc();
            case "Radian":
                return new Radian();
//Pressure
            case "Bar":
                return new Bar();
            case "Pascal":
                return new Pascal();
            case "Pound per square inch":
                return new PoundPerSquareInch();
            case "Standard atmosphere":
                return new StandardAtmosphere();
            case "Torr":
                return new Torr();
//Speed
            case "Mile per hour":
                return new MilePerHour();
            case "Foot per second":
                return new FootPerSecond();
            case "Meter per second":
                return new MeterPerSecond();
            case "Kilometer per hour":
                return new KilometerPerHour();
            case "Knot":
                return new Knot();
//Tempreture
            case "Degree Celsius":
                return new DegreeCelsius();
            case "Fahrenheit":
                return new Fahrenhiet();
            case "Kelvin":
                return new Kelvin();
//Time
            case "Nanosecond":
                return new NanoSecond();
            case "Microsecond":
                return new MicroSecond();
            case "Millisecond":
                return new MilliSecond();
            case "Second":
                return new Second();
            case "Minute":
                return new Minute();
            case "Hour":
                return new Hour();
            case "Day":
                return new Day();
            case "Week":
                return new Week();
            case "Month":
                return new Month();
            case "Calendar Year":
                return new CalenderYear();
            case "Decade":
                return new Decade();
            case "Century":
                return new Century();
//Volume
            case "US liquid gallon":
                return new UsLiquidGallon();
            case "US liquid quart":
                return new UsLiquidQuart();
            case "US liquid pint":
                return new UsLiquidPint();
            case "US legal cup":
                return new UsLegalCup();
            case "Fluid ounce":
                return new FluidOunce();
            case "US tablespoon":
                return new UsTableSpoon();
            case "US teaspoon":
                return new UsTeaSpoon();
            case "Cubic meter":
                return new CubicMeter();
            case "Liter":
                return new Liter();
            case "Milliliter":
                return new MilliLiter();
            case "Imperial gallon":
                return new ImperialGallon();
            case "Imperial quart":
                return new ImperialQuart();
            case "Imperial pint":
                return new ImperialPint();
            case "Imperial cup":
                return new ImperialCup();
            case "Imp. fluid ounce":
                return new Imp_FluidOunce();
            case "Imperial tablespoon":
                return new ImperialTableSpoon();
            case "Imperial teaspoon":
                return new ImperialTeaSpoon();
            case "Cubic foot":
                return new CubicFoot();
            case "Cubic Inch":
                return new CubicInch();
        }

        return null;
    }
}


        
        
        
        
        
        
        
        
        
        
        
        
        