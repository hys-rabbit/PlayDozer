package controllers;

import javax.inject.Inject;

import org.dozer.Mapper;

import dtos.IndexDto;
import forms.IndexForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import services.IndexService;

public class IndexController extends Controller {
	@Inject
	private FormFactory formFactory;
	@Inject
	private Mapper mapper;
	@Inject
	private IndexService service; 
	
	public Result get() {
		Form<IndexForm> f = formFactory.form(IndexForm.class);
		IndexDto dto = new IndexDto();
		service.init(dto);
		return ok(views.html.index.render(f, dto));
	}

	public Result post() {
		Form<IndexForm> f = formFactory.form(IndexForm.class).bindFromRequest();
		IndexDto dto = mapper.map(f.get(), IndexDto.class);
		switch(f.get().action){
		case "regist":
			service.regist(dto);
			break;
		case "delete":
			service.delete(dto);
			break;
		default:
		}
		return ok(views.html.index.render(f, dto));
	}

}
