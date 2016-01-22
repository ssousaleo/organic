package br.pucrio.opus.smells.metrics;

import org.eclipse.jdt.core.dom.MethodDeclaration;

public class MethodMetrics {

	private String fqn;
	
	private Integer loc;
	
	/**
	 * McCabe cyclomatic complexity
	 */
	private Integer cyclomaticComplexity;
	
	/**
	 * How many calls this method makes to methods of the same class 
	 */
	private Integer localCalls;
	
	/**
	 * How many calls this method makes to methods of the other class 
	 */
	private Integer foreignCalls;
	
	private Integer parameterCount;
	
	/**
	 * max chains of methods’ calls
	 */
	private Integer maxChainSize;
	
	private MethodDeclaration methodDeclaration;

	public String getFqn() {
		return fqn;
	}

	public void setFqn(String fqn) {
		this.fqn = fqn;
	}

	public Integer getLoc() {
		return loc;
	}

	public void setLoc(Integer loc) {
		this.loc = loc;
	}

	public Integer getCyclomaticComplexity() {
		return cyclomaticComplexity;
	}

	public void setCyclomaticComplexity(Integer cc) {
		this.cyclomaticComplexity = cc;
	}

	public Integer getLocalCalls() {
		return localCalls;
	}

	public void setLocalCalls(Integer localCalls) {
		this.localCalls = localCalls;
	}

	public Integer getForeignCalls() {
		return foreignCalls;
	}

	public void setForeignCalls(Integer foreignCalls) {
		this.foreignCalls = foreignCalls;
	}

	public Integer getParameterCount() {
		return parameterCount;
	}

	public void setParameterCount(Integer parameterCount) {
		this.parameterCount = parameterCount;
	}

	public Integer getMaxChainSize() {
		return maxChainSize;
	}

	public void setMaxChainSize(Integer maxChainCount) {
		this.maxChainSize = maxChainCount;
	}

	public MethodDeclaration getMethodDeclaration() {
		return methodDeclaration;
	}

	public void setMethodDeclaration(MethodDeclaration methodDeclaration) {
		this.methodDeclaration = methodDeclaration;
	}
	
}
