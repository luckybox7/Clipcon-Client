package model;

import org.json.JSONObject;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Message {
	private String type;
	private JSONObject json;

	public Message(String jsonString) {
		try {
			json = new JSONObject(jsonString);
		} catch (Exception e) {
			json = new JSONObject();
			type = jsonString;
			json.put(TYPE, type);
			return;
		}
		type = json.getString(TYPE);
		System.out.println("type: " + type);
	}

	// public Message(String jsonString) {
	// json = new JSONObject(jsonString);
	// if (json.getString(TYPE) == null) {
	// json = new JSONObject();
	// json = new JSONObject();
	// type = jsonString;
	// json.put(TYPE, type);
	// }
	// }

	public Message(String type, String jsonString) {
		this.type = type;
		json = new JSONObject();
		json.put(TYPE, type);
		json.put(CONTENTS, jsonString);
		System.out.println(json.toString());
	}

	public JSONObject setJson(String json) {
		this.json = new JSONObject(json);
		return this.json;
	}

	public void add(String key, String value) {
		json.put(key, value);
	}

	public String get(String property) {
		return json.getString(property);
	}

	public final static String TYPE = "message type";

	public final static String REQUEST_SIGN_IN = "sign in";
	public final static String REQUEST_SIGN_UP = "sign up";
	public final static String REQUEST_CREATE_GROUP = "create group";
	public final static String REQUEST_JOIN_GROUP = "join group";
	public final static String REQUEST_TEST = "test";

	public final static String EMAIL = "email";
	public final static String NAME = "name";
	public final static String CONTENTS = "contents";
}
