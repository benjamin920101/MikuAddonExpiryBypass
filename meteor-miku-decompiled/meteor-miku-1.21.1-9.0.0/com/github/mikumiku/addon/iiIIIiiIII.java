/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Util
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIIIiiIi;
import com.github.mikumiku.addon.IIiIiIiiIi;
import com.github.mikumiku.addon.IIiiiIiiII;
import com.github.mikumiku.addon.IiIiIiiIII;
import com.github.mikumiku.addon.IiiIiiiIii;
import com.github.mikumiku.addon.IiiiiiIiii;
import com.github.mikumiku.addon.IiiiiiiiIi;
import com.github.mikumiku.addon.iIiIIIIiii;
import com.github.mikumiku.addon.iIiIiIiIIi;
import com.github.mikumiku.addon.iIiIiIiiIi;
import com.github.mikumiku.addon.iiIIiIiIII;
import com.github.mikumiku.addon.iiIiIIiiii;
import com.github.mikumiku.addon.iiiiIiiIiI;
import com.github.mikumiku.addon.ok.PreLaunchInitializer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;
import net.minecraft.util.Util;

public class iiIIIiiIII {
    private static /* synthetic */ void ALLATORIxDEMO(JFrame jFrame, CountDownLatch countDownLatch, ActionEvent actionEvent) {
        JFrame IiIIiIiiiI;
        CountDownLatch IiIIiIiiiI2 = countDownLatch;
        JFrame jFrame2 = IiIIiIiiiI = jFrame;
        jFrame2.setVisible((2 & 5) != 0);
        jFrame2.dispose();
        IiIIiIiiiI2.countDown();
    }

    private static /* synthetic */ void IiiiiiiIIi() {
        if (!((iiIIiIiIII)new IIiiiIiiII().ALLATORIxDEMO("")).ALLATORIxDEMO()) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException interruptedException) {
                // empty catch block
            }
            System.exit(0);
        }
    }

    public static void ALLATORIxDEMO() {
        CountDownLatch countDownLatch;
        CountDownLatch countDownLatch2 = new CountDownLatch(5 >> 2);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            countDownLatch = countDownLatch2;
        } catch (Exception exception) {
            countDownLatch = countDownLatch2;
            exception.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            JPanel jPanel;
            iIiIiIiiIi iIiIiIiiIi2;
            JTextField jTextField;
            JLabel jLabel;
            Object IiIIiIiiiI;
            JPanel jPanel2;
            JFrame jFrame;
            CountDownLatch countDownLatch2 = countDownLatch;
            JFrame jFrame3 = jFrame = new JFrame(IIiIiIiiIi.ALLATORIxDEMO("08\u0017%T\b\u00045"));
            jFrame3 = jFrame;
            jFrame3.setDefaultCloseOperation(3 >> 2);
            jFrame3.setSize(0x41E7 & 0x3FDA, 0x67E7 & 0x1A3E);
            jFrame2.setLocationRelativeTo(null);
            jFrame2.setResizable((3 & 4) != 0);
            IiIiIiiIII iiIiIiiIII = new IiIiIiiIII();
            iiIiIiiIII.setLayout(new BorderLayout());
            JPanel jPanel3 = jPanel2 = new JPanel();
            jPanel2.setOpaque((3 ^ 3) != 0);
            JPanel jPanel4 = jPanel2;
            jPanel3.setLayout(new BoxLayout(jPanel2, 4 ^ 5));
            int n = 0x7E & 0x33;
            jPanel3.setBorder(BorderFactory.createEmptyBorder(0x7D & 0x2A, n, 0x6D & 0x3A, n));
            Object object2 = IiIIiIiiiI = new JLabel(iIiIiIiIIi.ALLATORIxDEMO("Q^vC5neS"));
            object2 = IiIIiIiiiI;
            ((JComponent)object).setFont(new Font(IIiIiIiiIi.ALLATORIxDEMO("\u0017\u0002$\u000232\u0002\u001b%\\\t\u0015\u0010\u00133"), 4 ^ 5, 0x64 & 0x3F));
            ((JComponent)object).setForeground(Color.WHITE);
            ((JComponent)object).setAlignmentX(0.5f);
            JLabel jLabel3 = jLabel = new JLabel(iIiIiIiIIi.ALLATORIxDEMO("(\u0014\u0010%,\u0017,\u0018'\u000f9\r"));
            jLabel3 = jLabel;
            jLabel2.setFont(new Font(IIiIiIiiIi.ALLATORIxDEMO("\u0017\u0002$\u000232\u0002\u001b%\\\t\u0015\u0010\u00133"), 3 >> 2, 0x37 & 0x58));
            JLabel jLabel4 = jLabel;
            int n2 = 0x27FF & 0x58FF;
            jLabel2.setForeground(new Color(n2, 0x10FF & 0x6FFF, n2, 0x72E9 & 0xDDE));
            jLabel2.setAlignmentX(0.5f);
            jPanel3.add(Box.createVerticalStrut(0x1F & 0x74));
            jPanel2.add((Component)IiIIiIiiiI);
            jPanel2.add(Box.createVerticalStrut(--5));
            jPanel2.add(jLabel);
            jPanel2.add(Box.createVerticalStrut(0x3E & 0x69));
            Object object3 = IiIIiIiiiI = new iIiIIIIiii();
            ((JComponent)IiIIiIiiiI).setOpaque((2 & 5) != 0);
            Object object4 = IiIIiIiiiI;
            ((Container)object3).setLayout(new BoxLayout((Container)IiIIiIiiiI, 2 ^ 3));
            int n3 = 0x5E & 0x3F;
            ((JComponent)object3).setBorder(BorderFactory.createEmptyBorder(0x5E & 0x3F, n3, 0x3F & 0x5E, n3));
            Object object5 = IiIIiIiiiI;
            ((JComponent)object3).setMaximumSize(new Dimension(0x9FF & 0x775E, 0x73C3 & 0xDFE));
            JLabel jLabel6 = jLabel = new JLabel(iIiIiIiIIi.ALLATORIxDEMO("Fm"));
            jLabel6 = jLabel;
            jLabel5.setFont(new Font(IIiIiIiiIi.ALLATORIxDEMO("\u0017\u0002$\u000232\u0002\u001b%\\\t\u0015\u0010\u00133"), 3 & 4, 0x6F & 0x1E));
            JLabel jLabel7 = jLabel;
            int n4 = 0x4F & 0x76;
            jLabel5.setForeground(new Color(n4, 0x46 & 0x7F, n4));
            jLabel5.setAlignmentX(0.5f);
            JTextField jTextField2 = jTextField = new JTextField(0x17 & 0x7C);
            jTextField.setFont(new Font(iIiIiIiIIi.ALLATORIxDEMO("qcBcUSdzC=otvrU"), 3 ^ 3, 0x4E & 0x3F));
            JTextField jTextField3 = jTextField;
            int n5 = 0x52FC & 0x2DDF;
            boolean bl = 3 >> 1;
            int n6 = 0xE & 0x7B;
            jTextField2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(n5, 0x1ADC & 0x65FF, n5), bl ? 1 : 0, bl), BorderFactory.createEmptyBorder(n6, 0x2F & 0x5C, n6, 0x1E & 0x6D)));
            JTextField jTextField4 = jTextField;
            jTextField2.setMaximumSize(new Dimension(0x65B3 & 0x1B6E, 0x7A & 0x2D));
            jTextField2.setAlignmentX(0.5f);
            Object object6 = iiIiIIiiii.ALLATORIxDEMO();
            if (object6 != null && object6.has(IIiIiIiiIi.ALLATORIxDEMO("\b\"\u0019\"\u001a9\u001b?")) && !object6.get(iIiIiIiIIi.ALLATORIxDEMO("iDxD{_zY")).getAsString().isEmpty()) {
                jTextField.setText(object6.get(IIiIiIiiIi.ALLATORIxDEMO("\b\"\u0019\"\u001a9\u001b?")).getAsString());
            }
            Object object8 = object6 = new JLabel(iIiIiIiIIi.ALLATORIxDEMO("\u001c"));
            object8 = object6;
            ((JComponent)object7).setFont(new Font(IIiIiIiiIi.ALLATORIxDEMO("\u0017\u0002$\u000232\u0002\u001b%\\\t\u0015\u0010\u00133"), 5 >> 3, 0xF & 0x7C));
            Object object9 = object6;
            ((JComponent)object7).setForeground(new Color(0x1FC & 0x7EF7, 0x77 & 0x4B, 54));
            ((JComponent)object7).setAlignmentX(0.5f);
            iIiIiIiiIi iIiIiIiiIi4 = iIiIiIiiIi2 = new iIiIiIiiIi(iIiIiIiIIi.ALLATORIxDEMO("\u766c\u5f69"));
            iIiIiIiiIi4 = iIiIiIiiIi2;
            boolean bl2 = 5 >> 3;
            iIiIiIiiIi iIiIiIiiIi6 = iIiIiIiiIi2;
            iIiIiIiiIi6 = iIiIiIiiIi2;
            iIiIiIiiIi5.setFont(new Font(IIiIiIiiIi.ALLATORIxDEMO("\u0017\u0002$\u000232\u0002\u001b%\\\t\u0015\u0010\u00133"), --1, 15));
            iIiIiIiiIi5.setForeground(Color.WHITE);
            iIiIiIiiIi5.setFocusPainted(bl2);
            iIiIiIiiIi4.setBorderPainted(bl2);
            iIiIiIiiIi4.setContentAreaFilled((2 & 5) != 0);
            iIiIiIiiIi iIiIiIiiIi7 = iIiIiIiiIi2;
            iIiIiIiiIi4.setCursor(new Cursor(12));
            iIiIiIiiIi iIiIiIiiIi8 = iIiIiIiiIi2;
            iIiIiIiiIi3.setMaximumSize(new Dimension(290, 45));
            iIiIiIiiIi3.setAlignmentX(0.5f);
            JPanel jPanel5 = jPanel = new JPanel(new FlowLayout(4 ^ 5, 15, 3 >> 2));
            jPanel5.setOpaque(5 >> 3);
            JPanel jPanel6 = jPanel;
            jPanel5.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
            JButton jButton = iiIIIiiIII.ALLATORIxDEMO(iIiIiIiIIi.ALLATORIxDEMO("\u6cfd\u51b2\u8d31\u53cb"));
            JButton jButton2 = iiIIIiiIII.ALLATORIxDEMO(IIiIiIiiIi.ALLATORIxDEMO("\u5f88\u8bc4\u5b9e\u7877e"));
            jPanel5.add(jButton);
            jPanel.add(new IiiiiiIiii(iIiIiIiIIi.ALLATORIxDEMO("@")));
            jPanel.add(jButton2);
            ((Container)IiIIiIiiiI).add(jLabel);
            ((Container)IiIIiIiiiI).add(Box.createVerticalStrut(--5));
            ((Container)IiIIiIiiiI).add(jTextField);
            ((Container)IiIIiIiiiI).add(Box.createVerticalStrut(20));
            ((Container)IiIIiIiiiI).add((Component)object6);
            ((Container)IiIIiIiiiI).add(Box.createVerticalStrut(10));
            ((Container)IiIIiIiiiI).add(iIiIiIiiIi2);
            ((Container)IiIIiIiiiI).add(Box.createVerticalStrut(20));
            ((Container)IiIIiIiiiI).add(jPanel);
            jPanel2.add((Component)IiIIiIiiiI);
            iIiIiIiiIi3.addActionListener(arg_0 -> iiIIIiiIII.ALLATORIxDEMO((JLabel)object6, jTextField, jFrame, countDownLatch2, arg_0));
            jButton.addActionListener(actionEvent -> {
                Serializable IiIIiIiiiI = actionEvent;
                JFrame IiIIiIiiiI2 = jFrame;
                JOptionPane.showMessageDialog(IiIIiIiiiI2, iIiIiIiIIi.ALLATORIxDEMO("\u8bc6\u804e\u7cca\u7bbb\u7417\u5462\u8d3c\u4e4a\u6cd9\u5196"), IIiIiIiiIi.ALLATORIxDEMO("\u6380\u7946"), --1);
                class_156.getOperatingSystem().open("https://qm.qq.com/q/ugixHq8ceI");
            });
            jButton2.addActionListener(actionEvent -> {
                Serializable IiIIiIiiiI = actionEvent;
                JFrame IiIIiIiiiI2 = jFrame;
                JOptionPane.showMessageDialog(IiIIiIiiiI2, iIiIiIiIIi.ALLATORIxDEMO("\u8bd7\u805f\u7ce7\u7b96\u741b\u546e\u91d8\u7f50\u5bd1\u783d"), IIiIiIiiIi.ALLATORIxDEMO("\u63a6\u7960"), 4 ^ 5);
            });
            IiIiIiiIII iiIiIiiIII2 = iiIiIiiIII;
            iiIiIiiIII2.add((Component)jPanel2, IIiIiIiiIi.ALLATORIxDEMO("?5\u001a,\u0013("));
            jFrame.add(iiIiIiiIII2);
            jFrame.setVisible(3 >> 1);
        });
        try {
            countDownLatch2.await();
            return;
        } catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(JLabel serializable, JTextField jTextField, JFrame jFrame, CountDownLatch countDownLatch, ActionEvent actionEvent) {
        String IiIIiIiiiI;
        JLabel IiIIiIiiiI2;
        JLabel jLabel = serializable;
        serializable = actionEvent;
        JLabel jLabel2 = IiIIiIiiiI2 = jLabel;
        JLabel jLabel3 = IiIIiIiiiI2;
        jLabel2.setForeground(new Color(0x5D & 0x6E, 0x23BF & 0x5CEF, 0x5B & 0x74));
        jLabel2.setText(iIiIiIiIIi.ALLATORIxDEMO("\u7645\u5f42\u4e11"));
        IiIIiIiiiI = ((JTextComponent)((Object)IiIIiIiiiI)).getText();
        if (!IIIIIIiiIi.ALLATORIxDEMO(IIiIiIiiIi.ALLATORIxDEMO("\u0014\u0004(\u0000/JsW3\u001a6\u00125\u001d'\bo\u00148\t%\u0012>#C\t>\f\u007f\u00041\u0018=")).booleanValue()) {
            JLabel jLabel4 = IiIIiIiiiI2;
            JLabel jLabel5 = IiIIiIiiiI2;
            jLabel4.setForeground(new Color(0x71FC & 0xEF7, 0x77 & 0x4B, 0x3E & 0x77));
            jLabel4.setText(iIiIiIiIIi.ALLATORIxDEMO("\u8fff\u63b4\u590b\u8d05\uff07\u8beb\u68f7\u67f8\u7f67\u7ec9\u8fe0\u63b2\uff3d"));
            return;
        }
        iiIIiIiIII IiIIiIiiiI3 = new IIiiiIiiII().IiiiiiiIIi(IiIIiIiiiI);
        if (IiIIiIiiiI3.ALLATORIxDEMO()) {
            void IiIIiIiiiI4;
            void IiIIiIiiiI5;
            PreLaunchInitializer.authenticated = 2 ^ 3;
            iiIiIIiiii.ALLATORIxDEMO(IiIIiIiiiI, "", 5 >> 2);
            JLabel jLabel6 = IiIIiIiiiI2;
            jLabel6.setForeground(new Color(0x4D & 0x7E, 0xFEF & 0x70BF, 0x77 & 0x58));
            jLabel6.setText("\u767b\u5f55\u6210\u529f\uff01");
            PreLaunchInitializer.auth = "null";
            IiiiiiiiIi.IiiiiiiIIi(IiIIiIiiiI3.ALLATORIxDEMO());
            IiiIiiiIii.IiiiiiiIIi(IiIIiIiiiI3.IiiiiiiIIi());
            Timer timer = new Timer(0x7FA & 0x7BED, arg_0 -> iiIIIiiIII.ALLATORIxDEMO((JFrame)IiIIiIiiiI5, (CountDownLatch)IiIIiIiiiI4, arg_0));
            timer.setRepeats((2 & 5) != 0);
            timer.start();
            return;
        }
        IiIIiIiiiI2.setForeground(new Color(0x3CF6 & 0x43FD, 0x63 & 0x5F, 0x37 & 0x7E));
        IiIIiIiiiI2.setText("\u767b\u5f55\u5931\u8d25,\u8bf7\u91cd\u8bd5\uff1a" + IiIIiIiiiI3.ALLATORIxDEMO());
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[5 >> 2];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n = string2.length();
        int n2 = n - --1;
        char[] cArray = new char[n];
        int n3 = (1 ^ 3 ^ --5) << --3 ^ --4;
        int cfr_ignored_0 = --5 << --4 ^ 5 >> 1 << (4 ^ 5);
        int n4 = (5 >> 1 ^ --5) << --4 ^ --5 << (5 >> 2);
        int n5 = IiIIiIiiiI = string3.length() - --1;
        int n6 = n2;
        String string4 = string3;
        while (n6 >= 0) {
            int n7 = n2--;
            cArray[n7] = (char)(n4 ^ (string2.charAt(n7) ^ string4.charAt(IiIIiIiiiI)));
            if (n2 < 0) break;
            int n8 = n2--;
            char c = cArray[n8] = (char)(n3 ^ (string2.charAt(n8) ^ string4.charAt(IiIIiIiiiI)));
            if (--IiIIiIiiiI < 0) {
                IiIIiIiiiI = n5;
            }
            n6 = n2;
        }
        return new String(cArray);
    }

    private static /* synthetic */ JButton ALLATORIxDEMO(String string) {
        Object IiIIiIiiiI;
        String string2 = string;
        Object object = IiIIiIiiiI = new JButton(string2);
        boolean bl = 5 >> 3;
        Object object3 = IiIIiIiiiI;
        object3 = IiIIiIiiiI;
        ((JComponent)object2).setFont(new Font(iIiIiIiIIi.ALLATORIxDEMO("qcBcUSdzC=otvrU"), 3 >> 2, 0x6E & 0x1D));
        Object object4 = IiIIiIiiiI;
        int n = 0x7F & 0x64;
        ((JComponent)object2).setForeground(new Color(n, 0x75 & 0x6E, n));
        ((AbstractButton)object2).setFocusPainted(bl);
        ((AbstractButton)object).setBorderPainted(bl);
        ((AbstractButton)object).setContentAreaFilled((3 ^ 3) != 0);
        ((Component)IiIIiIiiiI).setCursor(new Cursor(0xE & 0x7D));
        Object object5 = IiIIiIiiiI;
        ((Component)IiIIiIiiiI).addMouseListener(new iiiiIiiIiI((JButton)IiIIiIiiiI));
        return IiIIiIiiiI;
    }

    public iiIIIiiIII() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIiIiiIi.ALLATORIxDEMO(" 05\u001d#\u0019P)\u00008\u0011(`\bp\u8b8b\u66a3\u65cb\u5260\u677c\u65fd\u7229\u672b\uff2a"));
        }
    }
}

