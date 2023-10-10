package org.example;

import java.util.List;

public class ProxyInternet implements IConexionInternet{

    private InternetService internetService;
    private List<String> sitiosBloqueados;
    public ProxyInternet(List<String> sitiosBloqueados, InternetService internetService){
        this.sitiosBloqueados = sitiosBloqueados;
        this.internetService = internetService;
    }

    @Override
    public void ConectarCon(String url){
        if(!this.sitiosBloqueados.contains(url)){
            this.internetService.ConectarCon(url);
        }  else {
            System.out.println("Acceso Denegado");
        }
    }
}
