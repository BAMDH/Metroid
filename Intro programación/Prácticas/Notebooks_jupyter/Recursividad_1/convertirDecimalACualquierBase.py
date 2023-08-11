
#USO DE RECURSIVIDAD DE COLA
def convertirDecimalAHexadecimal(numeroDec):
    diccionarioDecHexa = {0 : "0", 1 : "1", 2 : "2", 3 : "3", 4 : "4", 5 : "5", 6 : "6", 7 : "7",  8 : "8", 9 : "9", 10 : "A", 11: "B", 12 : "C",  13: "D" , 14 : "E" , 15 : "F"};
    parteEntera = int(numeroDec);
    
    parteFlotante = numeroDec - parteEntera;
    return convertirParteEnteraDecimalAOtraBase(parteEntera, 16, diccionarioDecHexa);

def convertirParteEnteraDecimalAOtraBase(parteEntera, base, diccionarioDecABase):
    if(parteEntera > 0):
        divEntera = parteEntera // base;
        residuo = parteEntera % base;        
        return diccionarioDecABase[residuo] + convertirParteEnteraDecimalAOtraBase(divEntera, base, diccionarioDecABase);
    else:
        return "";

#principal

hexa = convertirDecimalAHexadecimal(16);
print("el hexa: " + str(hexa));
    

    
    
    
    
