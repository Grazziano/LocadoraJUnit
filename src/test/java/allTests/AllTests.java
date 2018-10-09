/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allTests;

import local.model.ClienteTest;
import local.model.FilmeTest;
import local.service.LocacaoServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author grazz
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({LocacaoServiceTest.class, ClienteTest.class, FilmeTest.class})
public class AllTests {
    
}
