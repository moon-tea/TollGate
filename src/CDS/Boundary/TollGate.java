package Boundary;

public class TollGate 
{

	private String tollGateId;
	private String tollGateStatus;
	private int numCameras;
	private String[] cameraIds;
	private int numScanners;
	private String[] scannerIds;
	private double tollTagRate;
	private double zipCashRate;
	private int numLanes;
	private int tollGateNearestExitNumber;
	
	//default constructor
	public TollGate()
	{	}
	
	//get&set tollGateId
	protected void setTollGateId(String tollGateId)
	{
		this.tollGateId = tollGateId;
	}
	
	protected String getTollGateId()
	{
		return tollGateId;
	}
	
	//get&set tollGateStatus
	protected void setTollGateStatus(String tollGateStatus)
	{
		this.tollGateStatus = tollGateStatus;
	}	
	protected String getTollGateStatus()
	{
		return tollGateStatus;
	}
	
	//get&set numCameras
	protected void setNumCameras(int numCameras)
	{
		this.numCameras = numCameras;
	}
	
	protected int getNumCameras()
	{
		return numCameras;
	}
	
	//get&set cameraIds
	protected void setCameraIds(String[] cameraIds)
	{
		this.cameraIds = cameraIds;
		numCameras = cameraIds.length;
	}
	protected String[] getCameraIds()
	{
		return cameraIds;
	}
	
	//get&set numScanners
	protected void setNumScanners(int numScanners)
	{
		this.numScanners = numScanners;
	}
	
	protected int getNumScanners()
	{
		return numScanners;
	}
	
	//get&set scannerIds
	protected void setScannerIds(String[] scannerIds)
	{
		this.scannerIds = scannerIds;
		numScanners = this.scannerIds.length;
	}
	protected String[] getScannerIds()
	{
		return scannerIds;
	}
	
	//get&set tollGateRate
	protected void setTollTagRate(double tollTagRate)
	{
		this.tollTagRate = tollTagRate;
	}
	
	protected double getTollTagRate()
	{
		return tollTagRate;
	}
	
	//get&set zipCashRate
	protected void setZipCashRate(double zipCashRate)
	{
		this.zipCashRate = zipCashRate;
	}
	
	protected double getZipCashRate()
	{
		return zipCashRate;
	}

	//get&set numLanes
	protected void setNumLanes(int numLanes)
	{
		this.numLanes = numLanes;
	}
	
	protected int getNumLanes()
	{
		return numLanes;
	}

	//get&set tollGateNearestExitNumber
	protected void setTollGateNearestExitNumber(int tollGateNearestExitNumber)
	{
		this.tollGateNearestExitNumber = tollGateNearestExitNumber;
	}
	
	protected int getTollGateNearestExitNumber()
	{
		return tollGateNearestExitNumber;
	}
}
