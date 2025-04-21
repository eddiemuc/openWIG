package cz.matejcik.openwig;

import org.junit.Test;
import se.krka.kahlua.vm.LuaTable;
import se.krka.kahlua.vm.LuaTableImpl;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class EventTableTest {
	

	@Test
	public void simple() {
		final LuaTable table = new LuaTableImpl();
		final int MAX = 1000;
		for(int i = 0; i < MAX ; i++) {
			table.rawset("test" + i, "value" + i);
		}
		for(int i = 0; i < MAX ; i++) {
			assertThat(table.rawget("test" + i)).isEqualTo("value" + i);
		}

		assertThat(table.len()).isEqualTo(2);
	}
}
