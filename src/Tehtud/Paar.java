package Tehtud;

public class Paar<K, V> {
	private K Esimene;
	private V Teine;

	public Paar(K Esimene, V Teine) {
		this.Esimene = Esimene;
		this.Teine = Teine;
	}

	public K getEsimene() {
		return Esimene;
	}

	public void setEsimene(K Esimene) {
		this.Esimene = Esimene;
	}

	public V getTeine() {
		return Teine;
	}

	public void setTeine(V Teine) {
		this.Teine = Teine;
	}

	@Override
	public String toString() {
		return "Tehtud.Paar{" +
				"Esimene=" + Esimene +
				", Teine=" + Teine +
				'}';
	}
}
