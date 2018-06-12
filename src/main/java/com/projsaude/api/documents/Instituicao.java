package com.projsaude.api.documents;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Instituicao {

	@Id
	private String id;
	private String longitude;
	private String latitude;
	private String setorCensitario;
	private String areaDePoderacao;
	private String codDistritoIbge;
	private String distritoMunicipal;
	private String CodSubprefeitura;
	private String Subprefeitura;
	private String regiao5;
	private String regiao8;
	private String estabelecimentoSaude;
	private String endereco;
	private String bairro;
	private String telefone;
	private String cep;
	private String minSaudeOuCnes;
	private String codDependenciaAdministrativa;
	private String dependenciaAdministrativa;
	private String codTipoEstabelecimento;
	private String tipoEstabelecimento;
	private String CodClasseTiposEstabelecimentosSaude;
	private String ClasseClasseTiposEstabelecimentosSaude;
	private String leitosHospitalares;
	
	
	public Instituicao () {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getSetorCensitario() {
		return setorCensitario;
	}

	public void setSetorCensitario(String setorCensitario) {
		this.setorCensitario = setorCensitario;
	}

	public String getAreaDePoderacao() {
		return areaDePoderacao;
	}

	public void setAreaDePoderacao(String areaDePoderacao) {
		this.areaDePoderacao = areaDePoderacao;
	}

	public String getCodDistritoIbge() {
		return codDistritoIbge;
	}

	public void setCodDistritoIbge(String codDistritoIbge) {
		this.codDistritoIbge = codDistritoIbge;
	}

	public String getDistritoMunicipal() {
		return distritoMunicipal;
	}

	public void setDistritoMunicipal(String distritoMunicipal) {
		this.distritoMunicipal = distritoMunicipal;
	}

	public String getCodSubprefeitura() {
		return CodSubprefeitura;
	}

	public void setCodSubprefeitura(String codSubprefeitura) {
		CodSubprefeitura = codSubprefeitura;
	}

	public String getSubprefeitura() {
		return Subprefeitura;
	}

	public void setSubprefeitura(String subprefeitura) {
		Subprefeitura = subprefeitura;
	}

	public String getRegiao5() {
		return regiao5;
	}

	public void setRegiao5(String regiao5) {
		this.regiao5 = regiao5;
	}

	public String getRegiao8() {
		return regiao8;
	}

	public void setRegiao8(String regiao8) {
		this.regiao8 = regiao8;
	}

	public String getEstabelecimentoSaude() {
		return estabelecimentoSaude;
	}

	public void setEstabelecimentoSaude(String estabelecimentoSaude) {
		this.estabelecimentoSaude = estabelecimentoSaude;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getMinSaudeOuCnes() {
		return minSaudeOuCnes;
	}

	public void setMinSaudeOuCnes(String minSaudeOuCnes) {
		this.minSaudeOuCnes = minSaudeOuCnes;
	}

	public String getCodDependenciaAdministrativa() {
		return codDependenciaAdministrativa;
	}

	public void setCodDependenciaAdministrativa(String codDependenciaAdministrativa) {
		this.codDependenciaAdministrativa = codDependenciaAdministrativa;
	}

	public String getDependenciaAdministrativa() {
		return dependenciaAdministrativa;
	}

	public void setDependenciaAdministrativa(String dependenciaAdministrativa) {
		this.dependenciaAdministrativa = dependenciaAdministrativa;
	}

	public String getCodTipoEstabelecimento() {
		return codTipoEstabelecimento;
	}

	public void setCodTipoEstabelecimento(String codTipoEstabelecimento) {
		this.codTipoEstabelecimento = codTipoEstabelecimento;
	}

	public String getTipoEstabelecimento() {
		return tipoEstabelecimento;
	}

	public void setTipoEstabelecimento(String tipoEstabelecimento) {
		this.tipoEstabelecimento = tipoEstabelecimento;
	}

	public String getCodClasseTiposEstabelecimentosSaude() {
		return CodClasseTiposEstabelecimentosSaude;
	}

	public void setCodClasseTiposEstabelecimentosSaude(String codClasseTiposEstabelecimentosSaude) {
		CodClasseTiposEstabelecimentosSaude = codClasseTiposEstabelecimentosSaude;
	}

	public String getClasseClasseTiposEstabelecimentosSaude() {
		return ClasseClasseTiposEstabelecimentosSaude;
	}

	public void setClasseClasseTiposEstabelecimentosSaude(String classeClasseTiposEstabelecimentosSaude) {
		ClasseClasseTiposEstabelecimentosSaude = classeClasseTiposEstabelecimentosSaude;
	}

	public String getLeitosHospitalares() {
		return leitosHospitalares;
	}

	public void setLeitosHospitalares(String leitosHospitalares) {
		this.leitosHospitalares = leitosHospitalares;
	}

	
}
