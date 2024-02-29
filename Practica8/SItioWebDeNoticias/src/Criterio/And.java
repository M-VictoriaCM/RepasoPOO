package Criterio;

import CriterioDeBusqueda.CriterioDeBusqueda;
import SitioWeb.Noticia;

public class And implements CriterioDeBusqueda {
    private CriterioDeBusqueda condicion1, condicion2;

    public And(CriterioDeBusqueda condicion1, CriterioDeBusqueda condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return condicion1.cumple(noticia) && condicion2.cumple(noticia);
    }
}
