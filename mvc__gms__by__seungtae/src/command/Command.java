package command;

import javax.servlet.http.HttpServletRequest;

import command.receiver.Path;
import lombok.Data;
@Data
public class Command implements Order{
	protected String action,domain,page,view;
	protected HttpServletRequest request;

	@Override
	public void execute() {
		this.view = "/WEB-INF/view/"+domain+Path.MAIN;
	}
	
}
