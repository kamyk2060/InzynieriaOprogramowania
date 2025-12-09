class MainApp {
    String faxNo;
    
    void main() {
        FaxMachine faxMachine = new FaxMachine(faxNo);
        faxMachine.sendFax("783675", "hello");
    }
}

class FaxMachine {
    String stationId;
    
    FaxMachine(String stationId) {
        this.stationId = stationId;
    }
    
    void sendFax(String toFaxNo, String msg) {
        FaxMachineHardware hardware = new FaxMachineHardware();
        hardware.setStationId(stationId);
        hardware.setRecipientFaxNo(toFaxNo);
        hardware.start();
        
        try {
            boolean morePagesNeeded = true;
            
            do {
                Graphics graphics = hardware.newPage();
                graphics.drawString(msg, 50, 50);
                morePagesNeeded = false;
            } while (morePagesNeeded);
            
        } finally {
            hardware.done();
        }
    }
}