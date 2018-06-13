package com.projsaude.api.documents;


import org.hibernate.validator.constraints.NotEmpty;
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

	@NotEmpty
	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@NotEmpty
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@NotEmpty
	public String getSetorCensitario() {
		return setorCensitario;
	}

	public void setSetorCensitario(String setorCensitario) {
		this.setorCensitario = setorCensitario;
	}

	@NotEmpty
	public String getAreaDePoderacao() {
		return areaDePoderacao;
	}

	public void setAreaDePoderacao(String areaDePoderacao) {
		this.areaDePoderacao = areaDePoderacao;
	}

	@NotEmpty
	public String getCodDistritoIbge() {
		return codDistritoIbge;
	}

	public void setCodDistritoIbge(String codDistritoIbge) {
		this.codDistritoIbge = codDistritoIbge;
	}

	@NotEmpty
	public String getDistritoMunicipal() {
		return distritoMunicipal;
	}

	public void setDistritoMunicipal(String distritoMunicipal) {
		this.distritoMunicipal = distritoMunicipal;
	}

	@NotEmpty
	public String getCodSubprefeitura() {
		return CodSubprefeitura;
	}

	public void setCodSubprefeitura(String codSubprefeitura) {
		CodSubprefeitura = codSubprefeitura;
	}

	@NotEmpty
	public String getSubprefeitura() {
		return Subprefeitura;
	}

	public void setSubprefeitura(String subprefeitura) {
		Subprefeitura = subprefeitura;
	}

	@NotEmpty
	public String getRegiao5() {
		return regiao5;
	}

	public void setRegiao5(String regiao5) {
		this.regiao5 = regiao5;
	}

	@NotEmpty
	public String getRegiao8() {
		return regiao8;
	}

	public void setRegiao8(String regiao8) {
		this.regiao8 = regiao8;
	}

	@NotEmpty
	public String getEstabelecimentoSaude() {
		return estabelecimentoSaude;
	}

	public void setEstabelecimentoSaude(String estabelecimentoSaude) {
		this.estabelecimentoSaude = estabelecimentoSaude;
	}

	@NotEmpty
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@NotEmpty
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@NotEmpty
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@NotEmpty
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@NotEmpty
	public String getMinSaudeOuCnes() {
		return minSaudeOuCnes;
	}

	public void setMinSaudeOuCnes(String minSaudeOuCnes) {
		this.minSaudeOuCnes = minSaudeOuCnes;
	}

	@NotEmpty
	public String getCodDependenciaAdministrativa() {
		return codDependenciaAdministrativa;
	}

	public void setCodDependenciaAdministrativa(String codDependenciaAdministrativa) {
		this.codDependenciaAdministrativa = codDependenciaAdministrativa;
	}

	@NotEmpty
	public String getDependenciaAdministrativa() {
		return dependenciaAdministrativa;
	}

	public void setDependenciaAdministrativa(String dependenciaAdministrativa) {
		this.dependenciaAdministrativa = dependenciaAdministrativa;
	}

	@NotEmpty
	public String getCodTipoEstabelecimento() {
		return codTipoEstabelecimento;
	}

	public void setCodTipoEstabelecimento(String codTipoEstabelecimento) {
		this.codTipoEstabelecimento = codTipoEstabelecimento;
	}

	@NotEmpty
	public String getTipoEstabelecimento() {
		return tipoEstabelecimento;
	}

	public void setTipoEstabelecimento(String tipoEstabelecimento) {
		this.tipoEstabelecimento = tipoEstabelecimento;
	}

	@NotEmpty
	public String getCodClasseTiposEstabelecimentosSaude() {
		return CodClasseTiposEstabelecimentosSaude;
	}

	public void setCodClasseTiposEstabelecimentosSaude(String codClasseTiposEstabelecimentosSaude) {
		CodClasseTiposEstabelecimentosSaude = codClasseTiposEstabelecimentosSaude;
	}

	@NotEmpty
	public String getClasseClasseTiposEstabelecimentosSaude() {
		return ClasseClasseTiposEstabelecimentosSaude;
	}

	public void setClasseClasseTiposEstabelecimentosSaude(String classeClasseTiposEstabelecimentosSaude) {
		ClasseClasseTiposEstabelecimentosSaude = classeClasseTiposEstabelecimentosSaude;
	}

	@NotEmpty
	public String getLeitosHospitalares() {
		return leitosHospitalares;
	}

	public void setLeitosHospitalares(String leitosHospitalares) {
		this.leitosHospitalares = leitosHospitalares;
	}

	
}
