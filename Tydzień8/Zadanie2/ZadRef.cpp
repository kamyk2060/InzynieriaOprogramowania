#include <iostream>

class sprzedawca
{
public: 
    int liczbaOpoznionychDostaw = 0;
    
    void raportujOpoznionaDostawe()
    {
        liczbaOpoznionychDostaw++;
    }
    
    bool sprawdzTerminowoscSprzedawcy()
    {
        return liczbaOpoznionychDostaw <= 5;
    }
    
    // Inne pola i metody
};