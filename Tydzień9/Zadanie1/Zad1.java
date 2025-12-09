class MainApp
{
	String faxNo;
	void main()
	{
		FaxMachine faxMachine = new FaxMachine(this);
		faxMachine.sendFax("783675", "hello");
	}
}
class FaxMachine {
	MainApp app;
	FaxMachine(MainApp app)
	{
		this.app = app;
	}
	void sendFax(String toFaxNo, String msg) 
	{
		FaxMachineHardware hardware = ...;
		hardware.setStationId(app.getFaxNo());
		hardware.setRecipientFaxNo(toFaxNo);
		hardware.start();
		try 
		{
			do 
			{
				Graphics graphics = hardware.newPage();
				//draw the msg into the graphics.
			} while (more page is needed);
		}
		finally
		{
			hardware.done();
		}
	}
}