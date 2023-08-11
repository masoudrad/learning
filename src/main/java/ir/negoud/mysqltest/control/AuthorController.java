package ir.negoud.mysqltest.control;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ir.negoud.mysqltest.accessingdatamysql.AuthorRepository;
import ir.negoud.mysqltest.entity.Author;

@RestController
@RequestMapping(path = "/author")
public class AuthorController {
	
	private AuthorRepository authorRepository;
	
	@Autowired
	public void setAuthorRepository(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@PostMapping(path="/add", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE) // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (
			  @RequestBody Author author) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

//	    Author author = new Author();
//	    author.setFirstName(firstName);
//	    author.setLastName(lastName);
//	    author.setEmail(email);
	    authorRepository.save(author);
	    return "Saved";
	  }

	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<Author> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return authorRepository.findAll();
	  }
	  
	@PutMapping(path="/edit", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String editAuthor(@RequestBody Author author) {
		Optional<Author> authorEntity = authorRepository.findById(author.getId());
		
		if(authorEntity.isPresent()) {
			authorRepository.save(author);
			return author.toString();
		}
		return "This author doesn't exist.";
	}
}
