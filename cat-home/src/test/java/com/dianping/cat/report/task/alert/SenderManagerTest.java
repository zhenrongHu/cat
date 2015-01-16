package com.dianping.cat.report.task.alert;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.unidal.lookup.ComponentTestCase;

import com.dianping.cat.report.task.alert.sender.AlertChannel;
import com.dianping.cat.report.task.alert.sender.AlertMessageEntity;
import com.dianping.cat.report.task.alert.sender.sender.SenderManager;

public class SenderManagerTest extends ComponentTestCase {

	@Test
	public void test() {
		SenderManager manager = lookup(SenderManager.class);

		List<String> receivers = new ArrayList<String>();
		AlertMessageEntity message = new AlertMessageEntity("group", "title", "type", "content", receivers);

		receivers.add("yong.you@dianping.com");
		receivers.add("yong.you2@dianping.com");
		manager.sendAlert(AlertChannel.MAIL, message);
	}

}
