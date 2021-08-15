package cl.jparsoft.api.seguros.apiseguros.models;

public class RequestBO<T> {
	T data;
	Metadata metaData;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Metadata getMetaData() {
		return metaData;
	}
	public void setMetaData(Metadata metaData) {
		this.metaData = metaData;
	}
}
