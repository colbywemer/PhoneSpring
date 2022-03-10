package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Phone {
	@Id
	@GeneratedValue
	private long id;
	private int storageSize;
	private int numberOfCameras;
	private String model;
	private String resolution;
	private String processer;
	public Phone() {
		super();
		this.storageSize = 256;
	}
	public Phone(String model) {
		super();
		this.model = model;
	}
	public Phone(int storageSize, int numberOfCameras, String model, String resolution, String processer) {
		super();
		this.storageSize = storageSize;
		this.numberOfCameras = numberOfCameras;
		this.model = model;
		this.resolution = resolution;
		this.processer = processer;
	}
	public Phone(long id, int storageSize, int numberOfCameras, String model, String resolution, String processer) {
		super();
		this.id = id;
		this.storageSize = storageSize;
		this.numberOfCameras = numberOfCameras;
		this.model = model;
		this.resolution = resolution;
		this.processer = processer;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getStorageSize() {
		return storageSize;
	}
	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}
	public int getNumberOfCameras() {
		return numberOfCameras;
	}
	public void setNumberOfCameras(int numberOfCameras) {
		this.numberOfCameras = numberOfCameras;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public String getProcesser() {
		return processer;
	}
	public void setProcesser(String processer) {
		this.processer = processer;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", storageSize=" + storageSize + ", numberOfCameras=" + numberOfCameras + ", model="
				+ model + ", resolution=" + resolution + ", processer=" + processer + "]";
	}
}
