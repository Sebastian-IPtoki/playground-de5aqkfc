// {
package com.yourself;

import java.util.Arrays;
import com.google.gson.Gson;

public class DataCapture {
// }

/*
 * Get sensor data from a source. For the purpose of this demo
 * we get the source from a simple variable.
 *
 * @return  a two-dimension array containing accelerometer data
 */
private static double[][] getSensorData() {
    double[][] sensorData = {
		{0.51231234125, 0.64536234265, 0.521362734526},
        {0.56131272345347, 0.126542435672, 0.156237345237},
        {0.65172345762, 0.323467234, 1.2}
	};
	return sensorData;
}

/**
 * Build the json string from the given data.
 * The data must be a two-dimensional double array
 * 
 * @return  a json string of the two-dimensional array
 */

private static String buildDataCaptureJson(double[][] data) {
    Gson gson = new Gson(); // Remove
    return gson.toJson(data);
}

/**
 * Return the json formatted string of the latest data 
 * capture registered.
 *
 * @return a data capture json string
 */
public static String getDataCaptureJson() {
    double[][] sensorData = getSensorData();

    String jsonString = buildDataCaptureJson(sensorData);

	return jsonString;
}

//{
}
//}