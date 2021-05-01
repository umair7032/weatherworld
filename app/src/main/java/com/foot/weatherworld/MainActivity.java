package com.foot.weatherworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn_cityid, btn_weatherbyid, btn_weathrbyname;
    EditText et_datainput;
    ListView lv_weatherReport;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //assgin values

        btn_cityid = findViewById(R.id.btn_cityid);
        btn_weatherbyid = findViewById(R.id.btn_weatherbyid);
        btn_weathrbyname = findViewById(R.id.btn_weatherbyname);


        et_datainput = findViewById(R.id.et_datainput);
        lv_weatherReport = findViewById(R.id.lv_weatherreport);
        WeatherDataService weatherDataService=new WeatherDataService(MainActivity.this);

        //click listners
        btn_weathrbyname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weatherDataService.getCityForecastByName(et_datainput.getText().toString(), new WeatherDataService.getcityforecastbynamecallback() {
                    @Override
                    public void onError(String message) {
                        Toast.makeText(MainActivity.this, "Error404", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(List<WeatherReportModel> weatherReportModels) {
                        //put inList view

                        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,weatherReportModels);
                        lv_weatherReport.setAdapter(arrayAdapter);

                    }
                });            }
        });
        btn_cityid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                weatherDataService.GetCityId(et_datainput.getText().toString(), new WeatherDataService.VolleyResponseListener() {
                    @Override
                    public void onError(String message) {
                        Toast.makeText(MainActivity.this, "Something is wrong",Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onResponse(String cityID) {
                        Toast.makeText(MainActivity.this, "CITY ID =" + cityID,Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
        btn_weatherbyid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weatherDataService.getCityForecastByID(et_datainput.getText().toString(), new WeatherDataService.Forecastbyidresponse() {
                    @Override
                    public void onError(String message) {
                        Toast.makeText(MainActivity.this, "Error404", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(List<WeatherReportModel> weatherReportModels) {
                        //put inList view

                        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,weatherReportModels);
                        lv_weatherReport.setAdapter(arrayAdapter);

                    }
                });

            }
        });
    }
}