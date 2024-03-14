public class CriterioArtista implements Criterio{
    private String artista;

    public CriterioArtista(String artista) {
        this.artista = artista;
    }
    @Override
    public boolean cumple(Pista pista){
        return pista.getArtista().equals(artista);
    }
}
