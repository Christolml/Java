package p2;

public class calcuNormal {

    private double num2=0;
    private int tipo=0;
    
    
public void suma(double entrada)
{
       if(tipo==2)
    {
        num2=num2-entrada;  
    }
    else if(tipo==3)
    {
        num2=num2*entrada;         
    }
    else if(tipo==4)
    {
        num2=num2/entrada;         
    }
    else
    {
        if(num2 == 0)
            num2=entrada;
        else
            num2=num2+entrada;              
    }
    tipo=1;
}

public void resta(double entrada)
{
    if(tipo==1)
    {
        num2=num2+entrada;   
    }
    else if(tipo==3)
    {
        num2=num2*entrada;         
    }
    else if(tipo==4)
    {
        num2=num2/entrada;         
    }
    else
    {
        if(num2 == 0)
            num2=entrada;
        else
            num2=num2-entrada;       
    }      
    tipo=2;
}

public void multiplicar(double entrada)
{
    if(tipo==1)
    {
        num2=num2+entrada;   
    }
    else if(tipo==2)
    {
        num2=num2-entrada;         
    }
    else if(tipo==4)
    {
        num2=num2/entrada;         
    }
    else
    {
        if(num2 == 0)
            num2=entrada;
        else
            num2=num2*entrada;       
    }     
    tipo=3;
}

public void dividir(double entrada)
{
    if(tipo==1)
    {
        num2=num2+entrada;   
    }
    else if(tipo==2)
    {
        num2=num2-entrada;         
    }
    else if(tipo==3)
    {
        num2=num2*entrada;         
    }
    else
    {
        if(num2 == 0)
            num2=entrada;
        else
            num2=num2/entrada;       
    } 
    tipo=4;
}

public double resultado(double entrada)
{
    double resultado=0;
    switch(tipo)
    {
        case 1:   
            resultado=num2+entrada;
            tipo=0;
            num2=0;
        break;
        case 2:
            resultado=num2-entrada;
            tipo=0;
            num2=0;
        break;
        case 3:
            resultado=num2*entrada;
            tipo=0;
            num2=0;
        break;
        case 4:
            resultado=num2/entrada;
            tipo=0;
            num2=0;
        break;
            
            
    } 
    return resultado;
    
}




    
}
