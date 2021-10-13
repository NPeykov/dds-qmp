package model.ServicioClima;

import java.util.*;

public final class AccuWeatherAPI {

    public final List<Map<String, Object>> getWeather(String ciudad) {
		return Arrays.asList(new HashMap<String, Object>(){{
			put("DateTime", "2019-05-03T01:00:00-03:00");
			put("EpochDateTime", 1556856000);
			put("WeatherIcon", 33);
			put("IconPhrase", "Clear");
			put("IsDaylight", false);
			put("PrecipitationProbability", 0);
			put("MobileLink", "http://m.accuweather.com/en/ar/villa-vil/7984/");
			put("Link", "http://www.accuweather.com/en/ar/villa-vil/7984");
			put("Temperature", new HashMap<String, Object>(){{
				put("Value", 57);
				put("Unit", "F");
				put("UnitType", 18);
			}});
		}});
	}

	public final Map<String, List<String>> getAlerts(String city){
		return new Map<String, List<String>>() {
			@Override
			public int size() {
				return 0;
			}

			@Override
			public boolean isEmpty() {
				return false;
			}

			@Override
			public boolean containsKey(Object o) {
				return false;
			}

			@Override
			public boolean containsValue(Object o) {
				return false;
			}

			@Override
			public List<String> get(Object o) {
				return null;
			}

			@Override
			public List<String> put(String s, List<String> strings) {
				return null;
			}

			@Override
			public List<String> remove(Object o) {
				return null;
			}

			@Override
			public void putAll(Map<? extends String, ? extends List<String>> map) {

			}

			@Override
			public void clear() {

			}

			@Override
			public Set<String> keySet() {
				return null;
			}

			@Override
			public Collection<List<String>> values() {
				return null;
			}

			@Override
			public Set<Entry<String, List<String>>> entrySet() {
				return null;
			}
		};
	}
}